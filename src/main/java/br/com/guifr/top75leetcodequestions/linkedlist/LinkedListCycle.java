package br.com.guifr.top75leetcodequestions.linkedlist;

public class LinkedListCycle {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public boolean hasCycle(ListNode head) {

        ListNode actual = head;
        ListNode next = head;
        while(head != null ){
            int jump = 2;

            while(jump-- > 0 && next != null){
                next = next.next;
            }

            if(next == head) return true;

            head = head.next;
        }

        return false;
    }

    public boolean hasCycleBeautiful(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }


}
