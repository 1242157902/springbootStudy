package com.talkingdata.sdmk.algorithm.stringInclude;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.algorithm.stringInclude
 * @Description: 字符串包含问题
 * @date 2018/7/2 14:43
 * @email 1242157902@qq.com
 */
public class StringInclude {

    /**
     *题目描述：
     *        假设这有一个各种字母组成的字符串A，和另外一个字符串B，
     *        字符串里B的字母数相对少一些。什么方法能最快的查出所有小字符串B里的字母在大字符串A里都有？
     *
     * @param args
     */
    public static void main(String[] args) {
        String longString="ABCDEFGHSLMNOPQR";
        String shortString="DCGSRQPOZ";
      /*  Boolean flag = compareString1(longString,shortString);
        System.out.println(flag);*/

        char[] longStringArray = longString.toCharArray();
        char[] shortStringArray = shortString.toCharArray();
        quickSort(longStringArray,0,longStringArray.length -1);
        quickSort(shortStringArray, 0, shortStringArray.length - 1);
        Boolean flag = compareString2(longStringArray, shortStringArray);
        System.out.println(flag);
    }


    /**
     * 判断一个字符串是否在另一个字符串中，最直观也是最简单的思路是，
     * 针对第二个字符串string2中每一个字符，一一与第一个字符串string1中每个字符依次轮询比较，看它是否在第一个字符串string1中
     *
     *  时间复杂度：O(n*m)
     *
     * @param longString    ：较长的字符串
     * @param shortString   ：较短的字符串
     * @return
     */
    public static Boolean compareString1(String longString ,String shortString){
        Boolean flag = true;

        if(longString == null || shortString == null){
            flag = false;
        }

        int i,j = 0;
        char[] longStringArray = longString.toCharArray();
        char[] shortStringArray = shortString.toCharArray();

        for (i = 0; i < shortStringArray.length; i++) {
            for ( j = 0; j < longStringArray.length; j++) {
                if(longStringArray[j] == shortStringArray[i]){
                    break;
                }
            }
            if(j == longStringArray.length){
                flag = false;
                break;
            }
        }
        return flag;
    }


 /************************************* 第二种方法 ***************************************************/


    /**
     * 快速排序
     * @param strArray
     * @param low
     * @param high
     */
    public static void quickSort(char[] strArray,int low,int high){

        if(low < high){
            int k = partition(strArray,low,high);
            quickSort(strArray,low,k - 1);
            quickSort(strArray,k + 1,high);
        }
    }


    /**
     * 划分
     * @param strArray  ：字符传
     * @param low       ：低位
     * @param high      ：高位
     * @return
     */
    public static int partition(char[] strArray,int low ,int high){
        char key = strArray[low];
        while (low < high && strArray[high] >= key){
            high --;
        }

        strArray[low] = strArray[high];
        strArray[high] = key;

        while (low < high && strArray[low]<=key){
            low ++;
        }
        strArray[high] = strArray[low];
        strArray[low] = key;

        return low;
    }


    /**
     *  比较已经排好序的两个数组: 时间复杂度：o(mlogm) + o(nlogn) + o(m+n)
     * @param longStrArray          ：长字符串的数组
     * @param shortStrArray         ：短字符串的数组
     * @return
     */
    public static Boolean compareString2(char[] longStrArray,char[] shortStrArray){
        Boolean flag = false;
        int indexOne = 0;
        int indexTwo = 0;
        while (indexOne < longStrArray.length && indexTwo < shortStrArray.length){

            while (longStrArray[indexOne] < shortStrArray[indexTwo] && indexOne < longStrArray.length -1){
                indexOne ++;
            }

            if(longStrArray[indexOne] != shortStrArray[indexTwo]){
                break;
            }

            indexTwo ++;
        }
        if(indexTwo == shortStrArray.length){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }

}
