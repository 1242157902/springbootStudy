package com.talkingdata.sdmk.algorithm.binarysearch;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.algorithm.binarysearch
 * @Description: 二分查找要求：1、必须采用顺序存储结构 2、必须按关键字大小有序排列
 * @date 2018/2/24 10:55
 * @email 1242157902@qq.com
 */
public class BinarySearch {




    /**
     * 循环实现二分查找，已经排好序的数组，-1无法查找到数据
     * @param arr
     * @param x
     * @return
     */
    public static int binarySearch(int[] arr,int x){
        int low = 0;
        int high = arr.length -1 ;
        while (low <=high){
            int middle = (low + high)/2;
            if(x ==arr[middle]){
                return middle;
            }if(x < arr[middle]){
                high = middle -1;
            }else{
                low = middle + 1;
            }
        }
        return -1;
    }


    /**
     * 递归实现二分查找
     * @param dataset
     * @param data
     * @param beginIndex
     * @param endIndex
     * @return
     */
    public  static int binarySearch(int[] dataset ,int data,int beginIndex, int endIndex){
        int midIndex = (beginIndex + endIndex)/2;
        if(data < dataset[midIndex]|| data>dataset[midIndex]||beginIndex>endIndex){
            return -1;
        }
        if(data < dataset[midIndex]){
            return binarySearch(dataset,data,beginIndex,midIndex-1);
        }else if(data > dataset[midIndex]){
            return binarySearch(dataset,data,midIndex +1 ,endIndex);
        }else{
            return midIndex;
        }
    }

    public static void main(String[] args){
        int[] arr = { 6, 12, 33, 87, 90, 97, 108, 561 };
        System.out.println("循环查找：" + binarySearch(arr,87));
        System.out.println("递归查找：" + binarySearch(arr,87,0,arr.length-1));
    }
}
