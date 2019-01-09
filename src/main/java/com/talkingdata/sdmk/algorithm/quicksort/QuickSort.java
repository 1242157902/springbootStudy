package com.talkingdata.sdmk.algorithm.quicksort;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.algorithm.quicksort
 * @Description: 快速排序
 * @date 2018/2/26 11:47
 * @email 1242157902@qq.com
 */
public class QuickSort {

    //打印每次的排序结果
    public static void printLine(int[] arr){
        int arrLength = arr.length;
        for(int j=0; j<arrLength;j++){
            System.out.print(arr[j] + "  ");
        }
        System.out.println();
    }

    public static int partition(int[] a,int low,int high){
        int privotKey = a[low];
        while (low<high){
            while (low<high && a[high]>=privotKey){
                --high;
            }
            a[low] = a[high];
            a[high] = privotKey;
            while (low<high && a[low]<=privotKey){
                ++low;
            }
            a[high] = a[low];
            a[low] = privotKey;
        }
        printLine(a);
        return low;
    }


    public static void quickSort(int[] a,int low, int high){
        if(low<high){
            int privotLoc = partition(a,low,high);  //将表一分为二
            quickSort(a,low,privotLoc -1 );
            quickSort(a,privotLoc +1,high);
        }
    }


    /**
     *基本思想：
     *      1、选择一个基准元素，通常选择第一个或者最后一个
     *      2、通过一趟排序，将其分割成相互独立的两部分，其中一部分是比基准元素值小，一部分记录是比基准元素大
     *      3、此时基准元素在其排好序后的正确位置
     *      4、然后分别对这两部分用同样的方法继续进行排序，知道整个序列有序
     *
     *通常被认为是同数量级（0log2n）的排序方法中平均性能最好的，但是属于不稳定排序方法
     */
    public static void main(String[] args){
        int arr[] = {49, 38, 65, 97, 76, 13, 27, 49};
        quickSort(arr,0,arr.length -1 );
    }


}
