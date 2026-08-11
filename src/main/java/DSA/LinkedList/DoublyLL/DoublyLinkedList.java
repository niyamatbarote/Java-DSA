package DSA.LinkedList.DoublyLL;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    // NODE CLASS :
    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.val = value;
        }

        public Node(int value, Node next) {
            this.val = value;
            this.next = next;
        }

        public Node(int value, Node next, Node prev) {
            this.val = value;
            this.next = next;
            this.prev = prev;
        }
    }

    // METHODS FOR DOUBLY LINKED LIST :-

    // Method to Insert At HEAD :
    public void insertHead(int val) {
        Node node = new Node(val);

        node.next = head;
        if (head != null) {
            head.prev = node;
        } else {
            tail = node;
            // OR tail = node;
        }

        head = node;
        head.prev = null;

        size += 1;
    }

    // Method to Display DLL :
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public int tailVal() {
        return tail.val;
    }

}

