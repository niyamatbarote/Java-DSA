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

        list.insertTail(8);
        list.insertTail(9);
        list.insertTail(10);


        System.out.println("Tail Val is : " +list.tailVal());
        list.display();
        System.out.println("Node Val at index 9 is : " +list.getNodeVal(9));
        System.out.println(list.removeHead());
        list.display();


    }
}
