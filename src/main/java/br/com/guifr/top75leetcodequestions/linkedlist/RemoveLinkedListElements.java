package br.com.guifr.top75leetcodequestions.linkedlist;

public class RemoveLinkedListElements {


     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode removeElements(ListNode head, int val) {

        ListNode newHead  = null;
        ListNode previous = head;

        while(head != null){

            if(newHead == null && head.val != val){
                newHead = head;
            }

            if(head.val != val){
                previous = head;
            }

            if(head.val == val){
                previous.next = head.next;
            }

            head = head.next;
        }

        return newHead;

    }

}
