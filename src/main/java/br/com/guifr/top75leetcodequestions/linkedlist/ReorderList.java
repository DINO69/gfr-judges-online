package br.com.guifr.top75leetcodequestions.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ReorderList {


     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public void reorderList(ListNode head) {

        List<ListNode> nodes = new ArrayList<>();
        while(head != null){
            nodes.add(head);
            head = head.next;
        }

        int init = 0;
        int end = nodes.size() - 1;
        while(init < end){
            nodes.get(init).next = nodes.get(end);
            init++;
            nodes.get(end).next = nodes.get(init);
            end--;
            nodes.get(init).next = null;
        }
    }

}
