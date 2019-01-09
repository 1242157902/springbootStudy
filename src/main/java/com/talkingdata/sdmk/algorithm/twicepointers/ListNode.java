package com.talkingdata.sdmk.algorithm.twicepointers;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.algorithm.twicepointers
 * @Description: ${todo}
 * @date 2018/2/28 14:40
 * @email 1242157902@qq.com
 */
public class ListNode {

    private int value;              //当前节点的值
    public ListNode next;          //下一个节点


    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setNext(ListNode next){
        this.next = next;
    }

    public ListNode getNext(){
        return next;
    }

}
