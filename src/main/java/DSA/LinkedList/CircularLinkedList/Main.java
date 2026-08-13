package DSA.LinkedList.CircularLinkedList;

public class Main {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insertTail(1);
        list.removeVal(1);
        list.display();

        list.insertTail(2);
        list.insertTail(3);
        list.insertTail(100);
        list.insertTail(4);
        list.insertTail(5);
        list.insertTail(6);
        list.display();

        list.removeVal(100);
        list.display();


    }
}
