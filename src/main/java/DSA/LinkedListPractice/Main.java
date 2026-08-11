package DSA.LinkedListPractice;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        list.insertLast(7);

        list.insertAt(5,6);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.getTailVal()+"this is Tail");
        System.out.println(list.deleteLast());

        list.display();
        System.out.println(list.deleteAt(1));
        System.out.println(list.getTailVal()+"this is Tail");
        list.display();

        System.out.println(list.size);
    }

}
