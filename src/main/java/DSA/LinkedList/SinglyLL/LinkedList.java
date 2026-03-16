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

    // Get ith Index Element :
    public Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
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
        System.out.print("NULL");
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
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    // Delete First Element :
    public int deleteFirst() {
        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return val ;
    }

    // Delete Last Element :
    public int deleteLast() {

        if (size<=1) {
            return deleteFirst();
        }
        int val = tail.value;
        Node node = getNode(size-2);
        tail = node;
        tail.next = null;
//        node = tail;
//        node.next = null;

        size--;

        return val;
    }

    // Delete At Index :
    public int deleteAtIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size-1) {
            return deleteLast();
        }

        Node prev = getNode(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;

        return val;
    }

    public Node search(int val) {
        Node node = head;

        while (node != null) {
            if (node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

}
