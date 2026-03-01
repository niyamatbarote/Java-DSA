package DSA.LinkedList.SinglyLL;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    // CLASS NODE :
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Insert Element to Head in LL (Method):
    public void insertHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // Show the LL :
    public void displayLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END..!!");
    }

    // Insert at TAIL :
    public void insertTail(int val) {
        if (tail==null) {
            insertHead(val);
            return;
        }
        Node node = new Node(val);
        tail.next =  node;
        tail = node;
        size++;
    }

    // Insert at Index :
    public void insertAt(int val, int index) {
        if (index == 0) {
            insertHead(val);
            return;
        }
        if (index == size) {
            insertTail(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        Node newTemp = temp.next;
        temp.next = node;
        node.next = newTemp;
        size++;
    }


}
