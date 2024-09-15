package linked_list;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedLists {
    public static void Excercise(LinkedList<Integer> list) {
        list.add(10);  // добавляет элемент в конец списка
        list.add(20);
        list.add(30);
        list.add(40);

        boolean contains = list.contains(10); // возвращает true, если список содержит элемент 10
        System.out.println("Связный список: " + list);
        System.out.println("Список содержит элемент " + list.get(0) + "? Ответ: " + contains);

        // Java LinkedList не предоставляет прямого метода для реверсирования,
        // но это можно сделать с помощью Collections.reverse()
        Collections.reverse(list);
        list.remove(Integer.valueOf(10)); // Удаляет первый элемент, равный 10

        for (int num : list) {
            System.out.print(num + " -> ");
        }
        System.out.println("null");
    }
}
