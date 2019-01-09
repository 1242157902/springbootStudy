package com.talkingdata.sdmk.algorithm.arryayMaxSum;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.algorithm.arryayMaxSum
 * @Description: ${todo}
 * @date 2018/7/5 14:50
 * @email 1242157902@qq.com
 */
public class MaxSubArraySum {


    /**
     * 题目：求子数组和的最大值
     * 输入一个整形数组，数组里有正数也有负数。
     *      数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和。求所有子数组的和的最大值。
     * @param args
     */
    public static void main(String[] args) {

        int[] array = {-1,2,-3,12,-5,-1,9,-2};
        findMaxSubArraySum(array);

    }


    public static void findMaxSubArraySum(int[] array){

        //sum为子数组的和
        int sum = 0;
        //为子数组的最大和
        int max = 0;
        //最大子数组的起始位置
        int startPos = 0;
        //最大子数组的结束位置
        int endPos = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i]; //求和
            //如果当前求得综合为负数的话，就将其清零，并且开始位置从下一个位置开始
            if(sum < 0){
                sum = 0;
                startPos = i + 1;
            }

            //如果求的总和大于之前得最大值的话，就将sum赋值给max，同时记录最后的位置
            if(sum > max){
                max = sum;
                endPos = i + 1;
            }
        }

        System.out.println("Max:" + max);
        for (int i = startPos; i < endPos; i++) {
            System.out.print(" " + array[i] );
        }
        System.out.println();
        System.out.println("startPos:" + startPos + ",endPos:" + endPos);
    }

}
