package DSA.LinkedList.SinglyLL;



public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertHead(3);
        list.insertHead(3);
        list.insertHead(3);
        list.insertHead(1);
        list.insertHead(1);
        list.insertTail(4);
        list.insertAt(2,2);
        list.displayLL();
        System.out.println("\n"+list.deleteAtIndex(1));
        list.displayLL();

        list.insertRec(1,1);
        list.displayLL();

        list.removeDuplicates();
        list.displayLL();


    }
}
