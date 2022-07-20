package br.com.guifr.hackerrank.preparationkit.threemonth.weekeight;


import java.io.BufferedWriter;
import java.io.IOException;

public class MergeTwoSortedLinkedLists {

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

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedList nodes = new SinglyLinkedList();

        while(head1 != null || head2 !=null){

            int add;

            if(head1 != null && head2 != null && head1.data < head2.data){
                add = head1.data;
                head1 = head1.next;
            }else if (head2 == null){
                add = head1.data;
                head1 = head1.next;
            }else{
                add = head2.data;
                head2 = head2.next;
            }

            nodes.insertNode(add);

        }


        return nodes.head;

    }

}
