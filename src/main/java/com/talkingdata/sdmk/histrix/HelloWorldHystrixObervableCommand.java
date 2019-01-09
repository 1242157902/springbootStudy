package com.talkingdata.sdmk.histrix;

import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixObservableCommand;
import rx.Observable;
import rx.Subscriber;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.histrix
 * @Description: ${todo}
 * @date 2018/9/27 16:58
 * @email 1242157902@qq.com
 */
public class HelloWorldHystrixObervableCommand extends HystrixObservableCommand<String> {

    private final String name ;

    protected HelloWorldHystrixObervableCommand(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.name = name;
    }



    @Override
    protected Observable<String> construct() {
        System.out.println("in construct! thread " + Thread.currentThread().getName());
        return Observable.create(new Observable.OnSubscribe<String>(){
            @Override
            public void call(Subscriber<? super String> observer) {
                try{
                    System.out.println("in call of construct! thread:" + Thread.currentThread().getName());
                    if(!observer.isUnsubscribed()){
                        //observer.onError(getExecutionException()); //直接异常退出，不会往下执行
                        observer.onNext("Hello1" + " thread:" + Thread.currentThread().getName());
                        observer.onNext("Hello2" + " thread:" + Thread.currentThread().getName());
                        observer.onNext(name +  " thread:" + Thread.currentThread().getName());
                        System.out.println("complete before------" + " thread:" + Thread.currentThread().getName());
                        observer.onCompleted(); //不会往下执行observer的任何方法
                        System.out.println("complete after------" + " thread:" + Thread.currentThread().getName());
                        observer.onCompleted(); // 不会执行到
                        observer.onNext("abc"); // 不会执行到
                    }

                }catch(Exception e){
                    observer.onError(e);
                }
            }

        });
    }


    public static void main(String[] args) {
        Observable<String> observable = new HelloWorldHystrixObervableCommand("test").observe();

        observable.subscribe(new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("completed");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("error-----------"+throwable);
            }

            @Override
            public void onNext(String s) {
                System.out.println("next------------" + s);
            }
        });
    }
}
