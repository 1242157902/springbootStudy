package com.talkingdata.sdmk.java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 函数式编程风格引入Java
 *          让程序员写出高效、干净、简洁的代码
 * User：    ysl
 * Date:   2018/1/19
 * Time:   15:55
 */
public class StreamDemo {

    public static void main(String[] args){
        final Collection<Streams.Task1> tasks = Arrays.asList(
                new Streams.Task1(Streams.Status.OPEN,5),
                new Streams.Task1(Streams.Status.OPEN,13),
                new Streams.Task1(Streams.Status.CLOSED,8)
        );

        final  long totalPointsOfOpenTasks = tasks.stream()
                .filter(task1 -> task1.getStatus() == Streams.Status.OPEN)
                .mapToInt(Streams.Task1::getPoints)
                .sum();
        System.out.println( "Total points: " + totalPointsOfOpenTasks );



        // Calculate total points of all tasks;    parallel
        final double totalPoints = tasks
                .stream()
                .parallel()
                .map(task -> task.getPoints()) // or map( Task::getPoints )
                .reduce(0, Integer::sum);

        System.out.println( "Total points (all tasks): " + totalPoints );



        // Group tasks by their status
        final Map<Streams.Status, List<Streams.Task1>> map = tasks
                .stream()
                .collect(Collectors.groupingBy(Streams.Task1::getStatus));
        System.out.println( map );



        // Calculate the weight of each tasks (as percent of total points)
        final Collection< String > result = tasks
                .stream()                                        // Stream< String >
                .mapToInt( Streams.Task1::getPoints )                     // IntStream
                .asLongStream()                                  // LongStream
                .mapToDouble( points -> points / totalPoints )   // DoubleStream
                .boxed()                                         // Stream< Double >
                .mapToLong( weigth -> ( long )( weigth * 100 ) ) // LongStream
                .mapToObj(percentage -> percentage + "%")      // Stream< String>
                .collect(Collectors.toList());                 // List< String >

        System.out.println( result );
    }
}
