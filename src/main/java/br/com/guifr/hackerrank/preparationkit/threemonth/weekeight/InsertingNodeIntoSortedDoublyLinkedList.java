package br.com.guifr.hackerrank.preparationkit.threemonth.weekeight;

import java.io.BufferedWriter;
import java.io.IOException;

public class InsertingNodeIntoSortedDoublyLinkedList {

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data)    {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        DoublyLinkedListNode head = llist;
        if(llist == null) return newNode;

        while(llist.next != null && llist.data < data){
            llist = llist.next;
        }

        System.out.println(llist.data);
        if(llist.next == null && llist.data < data){//last position
            llist.next = newNode;
            newNode.prev = llist;
        }else if(llist.prev == null){//first position
            newNode.next = llist;
            llist.prev = newNode;
            head = newNode;
        }else{
            newNode.next = llist;
            newNode.prev = llist.prev;
            llist.prev.next = newNode;
        }


        return head;
    }

}
