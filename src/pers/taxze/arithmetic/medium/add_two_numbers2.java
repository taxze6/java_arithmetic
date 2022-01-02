package pers.taxze.arithmetic.medium;
/**
 * 力扣2022年一月一日
 * 题目链接：https://leetcode-cn.com/problems/add-two-numbers/
 来源：力扣（LeetCode）
 */
public class add_two_numbers2 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode curr = head;
        int carry = 0;
        while(l1 != null || l2 != null){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int total = x + y + carry;
            curr.next = new ListNode(total % 10);
            curr = curr.next;
            carry = total/10;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        //加到最后一位还要进位
        if (carry != 0) curr.next = new ListNode(carry);
        return head.next;
    }

}
