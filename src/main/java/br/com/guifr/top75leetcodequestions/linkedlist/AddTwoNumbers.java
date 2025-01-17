package br.com.guifr.top75leetcodequestions.linkedlist;

//https://leetcode.com/problems/add-two-numbers/description/
public class AddTwoNumbers {



      //Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode keepHead = l1;

        int sum = 0;
        while(l2 != null || sum > 0){
            int sumL2 = 0;

            if(l2 != null){
                sumL2 = l2.val;
                l2 = l2.next;
            }

            sum += sumL2 + l1.val;

            l1.val = sum % 10;

            sum = sum / 10;

            if(l1.next == null && (l2 != null || sum > 0)){
                l1.next = new ListNode(sum);
                sum = 0;
            }

            StringBuilder sb = new StringBuilder();


            l1 = l1.next;

        }



        return keepHead;
    }

}
