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
    // //////////////////////////////////

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
        Node last = null;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
        System.out.println("Reversed List : ");

        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.print("START");
        System.out.println();
    }

    // Method to Print Tail Value
    public int tailVal() {
        return tail.val;
    }

    // MEthod to get the size of LIST
    public int getSize() {
        return size;
    }

    // Method to Insert At Tail :
    public void insertTail(int num) {
        Node node = new Node(num);
        if (size == 0) {
            insertHead(num);
        }
        node.prev = tail;
        tail.next = node;
        tail = node;
        size++;
    }

    // Mehod to get the ith Node :
    public Node getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Method to print ith Node val
    public int getNodeVal(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    // Method to insert At an INDEX;
    public void insertAt(int val, int index) {
        Node node = new Node(val);
        Node prev = getNode(index-1);
        Node next = getNode(index);
        // Connecting backward references :
        prev.next = node;
        node.prev = prev;
        // Connecting frontside references :
        node.next = next;
        next.prev = node;
        size++;
    }

    // Method to Remove Element From HEAD :
    public int removeHead() {
        int val = head.val;
        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return val;
        }
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // Method to REMOVE TAIL NODE
    public int removeTail() {
        if (size == 1) {
            removeHead();
        }
        Node prev = getNode(size-2);
        int val = prev.val;
        tail = prev;
        tail.next = null;
        size--;
        return val;
    }

    //Method to DELETE AT INDEX :
    public int removeAt(int index) {
        // IF Tail index = size -1
        if (index == size-1) {
            removeTail();
        }
        // IF HEAD index = 0
        if (index == 0) {
            removeHead();
        }
        Node node = getNode(index);
        int val = node.val;

        Node previous = getNode(index-1);

        // We Can use this ALSO
//        Node nextNode = getNode(index+1);
//        previous.next = nextNode;
//        nextNode.prev = previous;

        // REMOVING NODE only using previous Node
        previous.next = previous.next.next;
        previous.next.next.prev = previous;

        size--;
        return val;
    }

}

