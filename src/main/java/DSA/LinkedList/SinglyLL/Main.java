package DSA.LinkedList.SinglyLL;


import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertTail(1);
        list.insertTail(2);
        list.insertTail(4);
        list.insertTail(6);


        list.removeDuplicates();
        list.displayLL();
        LinkedList list1 = new LinkedList();
        list1.insertTail(1);
        list1.insertTail(3);
        list1.insertTail(4);
//        list1.insertTail(6);
        list1.displayLL();

        LinkedList mergedList = LinkedList.merge(list1,list);
        mergedList.displayLL();

    }
}
