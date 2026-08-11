package DSA.LinkedList.DoublyLL;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertHead(7);
        list.insertHead(6);
        list.insertHead(5);
        list.insertHead(4);
        list.insertHead(3);
        list.insertHead(2);
        list.insertHead(1);

        System.out.println("Tail Val is : " +list.tailVal());
        list.display();


    }
}
