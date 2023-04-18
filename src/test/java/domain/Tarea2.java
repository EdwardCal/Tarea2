package domain;

import org.testng.annotations.Test;

public class Tarea2 {

    @Test
    public void test1() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(new Student("1", "Maria", 20, "Cartago"));
        list.add(new Student("2", "Carlos", 18, "San Jose"));
        list.add(new Student("3", "Stephani", 22, "Heredia"));
        list.add(new Student("4", "Alejandro", 24, "Cartago"));
        list.add(new Student("5", "Alisson", 19, "San Jose"));

        DoublyLinkedList listD = new DoublyLinkedList();
        listD.add(new Course("IF-3001", "Algoritmos y Estructuras de Datos", 4));
        listD.add(new Course("IF-4001", "Sistemas Operativos", 4));
        listD.add(new Course("IF-2000", "Programacion 1", 4));
        listD.add(new Course("IF-3000", "Programacion 2", 4));
        listD.add(new Course("IF-4000", "Arquitectura", 4));

        CircularLinkedList listC = new CircularLinkedList();
        listC.add(1);
        listC.add(2);
        listC.add(3);
        listC.add(4);
        listC.add(5);



        System.out.println(list.toString());
    }
}
