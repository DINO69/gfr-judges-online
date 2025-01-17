package br.com.guifr.top75leetcodequestions.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MergeKSortedLists {

    // Definition for singly-linked list.
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

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) return null;

        Map<Integer, List<Integer>> valueByIndexs = new TreeMap<>();
        ListNode result = new ListNode();
        ListNode process = result;
        ListNode previous = result;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == null || lists.length == 0) continue;
            if (!valueByIndexs.containsKey(lists[i].val)) valueByIndexs.put(lists[i].val, new ArrayList<>());
            valueByIndexs.get(lists[i].val).add(i);
        }

        if (valueByIndexs.size() == 0) return null;

        while (valueByIndexs.size() > 0) {
            Map.Entry<Integer, List<Integer>> first = valueByIndexs.entrySet().iterator().next();
            int value = first.getKey();
            int index = first.getValue().remove(0);
            if (first.getValue().size() == 0) valueByIndexs.remove(value);

            //process current to result
            process.val = lists[index].val;
            process.next = new ListNode();
            previous = process;
            process = process.next;
            lists[index] = lists[index].next;

            //prepare next value
            //lists[index] = lists[index].next;
            if (lists[index] != null) {
                if (valueByIndexs.get(lists[index].val) == null) valueByIndexs.put(lists[index].val, new ArrayList<>());
                valueByIndexs.get(lists[index].val).add(index);
            }

        }

        previous.next = null;

        System.out.println(valueByIndexs);
        return result;
    }
}
