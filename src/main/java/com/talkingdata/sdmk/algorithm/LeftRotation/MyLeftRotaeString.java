package com.talkingdata.sdmk.algorithm.LeftRotation;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.algorithm.LeftRotation
 * @Description: ${todo}
 * @date 2018/6/28 11:02
 * @email 1242157902@qq.com
 */
public class MyLeftRotaeString {


    /**
     * Q 26 左旋转字符串
     * 题目：定义字符串的左旋转操作：把字符串前面的若干个字符移动到字符串的尾部。
     * 如把字符串abcdef左旋转2位得到字符串cdefab。
     * 请实现字符串左旋转的函数。要求时间对长度为n的字符串操作的复杂度为O(n)，辅助内存为O(1)。
     */
    public static void main(String[] args) {
        String data = "abcdef";
        String re = leftRotateString(data, 3);
        System.out.println(re);
    }


    /*
     * abcdef->ab.cdef->ba.fedc->cdefab
     */
    public static String  leftRotateString(String str,int n){

        if(str == null || str.length() == 0){
            return str;
        }

        if(n <= 0 || n > str.length()){
            return str;
        }

        int begin = 0;
        int end = str.length() -1 ;
        char[] letters = str.toCharArray();
        reverseString(letters,begin,n-1);
        reverseString(letters,n,end);
        reverseString(letters,begin,end);
        return new String(letters);
    }


    /**
     * 反转字传
     * @param letters       ：字符串
     * @param begin         ：起始位置
     * @param end           ：结束位置
     * @return
     */
    public static String reverseString(char[] letters, int begin, int end){

        if(begin > end){
            return null;
        }
        for (int i = begin, j = end; i < j ; i++ ,j--) {
            char tmp = letters[i];
            letters[i] = letters[j];
            letters[j] = tmp;
        }
        return new String(letters);
    }

}
