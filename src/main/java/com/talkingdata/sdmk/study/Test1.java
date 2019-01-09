package com.talkingdata.sdmk.study;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * User：    ysl
 * Date:   2017/6/28
 * Time:   20:40
 */
public class Test1 {


    public static void main(String[] args)
    {
        String content = "ffffffffffffffff";
        String baseUrl = "http://s.xdrig.com";
        try {
            Document document = Jsoup.connect(baseUrl + "/shorturl/bean").data("url", content).data("check", "bean").data("password", "").data("outOfTime", "0,0,0,0").data("checkStatus", "0").data("burnTime", "5").ignoreContentType(true).ignoreHttpErrors(true).timeout(50000).post();
           String  result =  baseUrl + "/" + document.text();
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                System.out.println( nums[i] + nums[j]);
                int sum = nums[i] + nums[j];
                if(sum==target)
                {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i=0;
        int j=nums.length - 1;

        while (i<j)
        {
            int sum = nums[i] + nums[j];
            System.out.println(sum);
            if(sum>target)
            {
                j--;
            }else if(sum<target){
                i++;
            }else if(sum ==target){
                result[0] = i;
                result[1] = j;
                System.out.print(i );
                System.out.print(j);
           }
        }
        return result;
    }

}
