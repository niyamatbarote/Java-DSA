package DSA.LinkedListPractice;

public class LL {

    private Node head;
    private Node tail;
    public int size;

    public LL() {
        size = 0;
    }


    private class Node {
        private Node next;
        private int value;

        public Node(Node next) {
            this.next = next;
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }
}
