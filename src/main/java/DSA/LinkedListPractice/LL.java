package DSA.LinkedListPractice;

import DSA.LinkedList.SinglyLL.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    public int size;

    public LL() {
        size = 0;
    }

    // Method to Insert at Head :
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        // IF Linked List is NULL
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // Method to Display NODE :
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Method a Insert Node at TAIL
    public void insertLast(int val) {

        // IF TAIL is ALREADY NULL
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        
        tail.next = node;
        node = tail;
        size ++;
        return;

    }
    
    // Insert at a Specific Index :
    public void insertAt(int index, int val) {
        // IF LL is Empty :
        if (tail == null) {
            insertFirst(val);
        }
        // IF Index = 0;
        if (index == 0) {
            insertFirst(val);
        }
        // IF Index size;
        if (index == size) {
            insertLast(val);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // Method to Delete Head Node
    public int deleteFirst() {

        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return val ;
    }

    // Method to Traverse Through List :
    public Node getNode(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Method to Delete Node at TAIL :
    public int deleteLast() {
        if (size<=1) {
            return deleteFirst();
        }
        int val = tail.value;
        Node node = getNode(size-1);
        tail = node;
        tail.next = null;
//        node = tail;
//        node.next = null;

        size--;

        return val;
    }

    // Method to Delete At Any Index in LL :
    public int deleteAt(int index) {
        if (index == 0) {
            deleteFirst();
        }
        if (index == size-1) {
            deleteLast();
        }
        Node temp = getNode(index-1);
        int val = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    // Method to get tail val
    public int getTailVal() {
        return tail.value;
    }

    private class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public Node( int value, Node next) {
            this.next = next;
            this.value = value;
        }
    }
}
