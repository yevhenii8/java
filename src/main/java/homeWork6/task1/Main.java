package homeWork6.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(7);
        list.add(8);
        list.add(10);
        list.add(45);
        list.display();

        System.out.println("пустой? " + list.isEmpty());
        System.out.println("размер: " + list.getSize());

        list.prepend(17);
        list.prepend(24);
        list.display();

        list.remove(45);
        list.remove(7);
        list.display();

        System.out.println("содержит число? " + list.contains(10));
        System.out.println("содержит число? " + list.contains(90));

        System.out.println("итератор:");

        DoublyLinkedList.ListIterator iterator = list.new ListIterator(list.getHead(), 0);

        System.out.println("вперед:");

        while (iterator.hasNext()) {
            int item = iterator.next();
            System.out.println(item);
        }
    }
}
