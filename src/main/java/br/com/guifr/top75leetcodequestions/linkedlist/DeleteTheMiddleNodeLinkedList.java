package br.com.guifr.top75leetcodequestions.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class DeleteTheMiddleNodeLinkedList {



     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode deleteMiddle(ListNode head) {

        List<ListNode> nodes = new ArrayList<>();

        while(head != null){
            nodes.add(head);
            head = head.next;
        }

        if(nodes.size() == 1) return null;

        if(nodes.size() == 2) {
            nodes.get(0).next = null;
            return nodes.get(0);
        }

        int middle = nodes.size() >> 1;

        //if(middle == nodes.size() - 1) {
        //    nodes.get(0).next = null;
        //    return nodes.get(0);
        //}

        nodes.get(middle -1).next = nodes.get(middle).next;


        return nodes.get(0);

    }
}
