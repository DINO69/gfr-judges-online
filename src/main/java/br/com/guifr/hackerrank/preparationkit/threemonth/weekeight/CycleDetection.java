package br.com.guifr.hackerrank.preparationkit.threemonth.weekeight;

import java.util.HashSet;
import java.util.Set;

public class CycleDetection {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }


    public static void main(String[] args) {
        System.out.println("a"+5+4+"");
        String s = "a";
        String s1 = "a";
        s += s1;
    }

    static boolean hasCycle(SinglyLinkedListNode head) {

        if(head == null || head.next == null)return false;

        Set<Object> numbers = new HashSet<>();
        while(head.next != null){
            if(numbers.contains(head)){
                return true;
            }
            System.out.println(head);
            numbers.add(head);
            System.out.println(head.data);
            head = head.next;

        }

        return false;
    }

}
