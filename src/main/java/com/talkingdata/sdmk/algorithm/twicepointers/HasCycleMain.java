package com.talkingdata.sdmk.algorithm.twicepointers;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.algorithm.twicepointers
 * @Description: ${todo}
 * @date 2018/2/28 14:45
 * @email 1242157902@qq.com
 */
public class HasCycleMain {


    /**
     * 判断链表是否有环
     *      其思想：
     *          建立两个指针，这两个指针可以是相同的方向，一般前进的速度不同或者两者的前进顺序不一致
     *          也可能是相反的方向，通过使用相关的变量来达到我们的目的
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head){
        if(head == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return  true;
            }
        }

        return head.next == head;
    }
}
