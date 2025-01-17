package br.com.guifr.top75leetcodequestions.linkedlist;

import java.util.List;

public class MergeTwoSortedLists {


//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public ListNode mergeTwoListsBeautiful(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                cur.next = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }

        cur.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        ListNode result = new ListNode(-101);

        processMerge(result,list1,list2);

        return result;
    }

    private void processMerge(ListNode result, ListNode list1, ListNode list2) {

        int val = -101;

        if(list1 != null && list2 != null){
            val = list1.val;
            if(list2.val <= list1.val){
                val = list2.val;
                list2 = list2.next;
            }else{
                list1 = list1.next;
            }
        }else{
            if(list1 != null){
                val = list1.val;
                list1 = list1.next;
            }
            if(list2 != null){
                val = list2.val;
                list2 = list2.next;
            }
        }

        if(val != -101){
            result.val = val;
            if(list1 != null || list2 != null){
                result.next = new ListNode();
                result = result.next;
            }
            processMerge(result,list1,list2);
        }
    }

}
