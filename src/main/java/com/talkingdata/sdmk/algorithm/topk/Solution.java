package com.talkingdata.sdmk.algorithm.topk;

import java.util.Arrays;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.algorithm.topk
 * @Description: ${todo}
 * @date 2018/7/10 10:19
 * @email 1242157902@qq.com
 */
public class Solution {


    /**
     * 求解数组，最大的k个数，或者最小的k个数
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 11, 8, 10, 5, 4, 22, 66, 23, 20};
        topK(arr,5);
    }


    /***
     * 利用快速排序的思想
     * @param array
     * @param k
     */
    public static void topK(int[] array,int k){
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(subArray(array,array.length - k,array.length)));
    }


    /**
     *  截取topk的数组
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int[] subArray(int[]array,int start,int end){
        int[] result = new int[end - start];
        for (int i= start;i<end;i++){
            result[i - start] = array[i];
        }
        return result;
    }


    public static int partition(int[]array,int low,int high){
        int provitKey = array[low];
        while (low < high){
            while (low < high && array[high] >= provitKey){
                high --;
            }
            array[low] = array[high];
            array[high] = provitKey;

            while (low < high && array[low] <= provitKey){
                low ++;
            }
            array[high] = array[low];
            array[low] = provitKey;
        }
        return low;
    }


    /**
     *
     * @param array
     * @param low
     * @param high
     */
    public static void quickSort(int[] array,int low,int high){

        if(low < high){
            int partition = partition(array,low,high);
            quickSort(array,low,partition-1);
            quickSort(array,partition + 1,high);
        }

    }

}
