package domain;

import org.testng.annotations.Test;

public class Tarea2 {

    @Test
    public void test1() {
        Node node= new Node();
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(new Student("1", "Maria", 20, "Cartago"));
        list.add(new Student("2", "Carlos", 18, "San Jose"));
        list.add(new Student("3", "Stephani", 22, "Heredia"));
        list.add(new Student("4", "Alejandro", 24, "Cartago"));
        list.add(new Student("5", "Alisson", 19, "San Jose"));

        DoublyLinkedList list2 = new DoublyLinkedList();
        list2.add(new Course("IF-3001", "Algoritmos y Estructuras de Datos", 4));
        list2.add(new Course("IF-4001", "Sistemas Operativos", 4));
        list2.add(new Course("IF-2000", "Programacion 1", 4));
        list2.add(new Course("IF-3000", "Programacion 2", 4));
        list2.add(new Course("IF-4000", "Arquitectura", 4));

        CircularLinkedList list3 = new CircularLinkedList();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);

        CircularDoublyLinkedList list4= new CircularDoublyLinkedList();
        list4.add("a");
        list4.add("b");
        list4.add("c");
        list4.add("d");
        list4.add("e");

        System.out.println(list.toString());
        System.out.println(list2.toString());
        System.out.println(list3.toString());
        System.out.println(list4.toString());

    }
}
