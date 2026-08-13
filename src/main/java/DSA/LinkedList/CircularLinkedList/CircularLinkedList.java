package DSA.LinkedList.CircularLinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    // Method to Insert Val :
    public void insertTail(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        // If size > 0
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
        return;
    }

    // Display the CLL :
    public void display() {
        Node node = head;
        if (size == 1) {
            System.out.print(head.val);
            System.out.print(" -> END");
            return;
        }
        if (head != null) {
            // we Used DO WHILE Statement here;
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
            System.out.print("HEAD");
        }
        System.out.println();
    }

    // NODE CLASS :
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
