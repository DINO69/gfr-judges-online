package br.com.guifr.top75leetcodequestions.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndOfList {


//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        List<ListNode> process = new ArrayList<>();

        while(head != null){
            process.add(head);
            head = head.next;
        }

        int remove = process.size() - n;

        if(remove == 0)
            if(process.size() == 1)
                return null;
            else
                return process.get(1);

        process.get(remove - 1).next = process.get(remove).next;

        return process.get(0);

    }

}
