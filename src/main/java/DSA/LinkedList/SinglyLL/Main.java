package DSA.LinkedList.SinglyLL;



public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertHead(15);
        list.insertHead(51);
        list.insertHead(53);
        list.insertHead(45);
        list.insertHead(95);
        list.insertTail(10);
        list.insertAt(122,2);

        list.displayLL();
    }
}
