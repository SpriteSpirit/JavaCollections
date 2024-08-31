package Lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

public class Practice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");

//        list2.addAll(list);
        List<String> list2 = new ArrayList<>(list);
        System.out.println(list); // Output: [Apple, Banana]
        System.out.println(list2); // Output: [Apple, Banana, Peach]

        list.add("Peach");
        list2.remove("Apple");

        System.out.println(list2.contains("Apple")); // false
        System.out.println(list.indexOf("Banana")); // 1
        System.out.println(new HashSet<>(list2).containsAll(list)); // false
        System.out.println(list.lastIndexOf("Banana")); // 1 поиск с конца
        System.out.println(list2.get(0)); // Banana

        System.out.println(list); // Output: [Apple, Banana, Peach]
        System.out.println(list2); // Output: [Banana]

        list2.clear(); // очистить список
        System.out.println(list2); // Output: []
        list2.add("Carrot");
        list2.add("Tomato");
        list2.add("Potato");
        System.out.println(list2); // Output: [Carrot, Tomato, Potato]
        System.out.println(list2.subList(1, 3)); // Output: [Tomato, Potato]
        list2.add("Pumpkin");
        list2.add("Zucchini");
        System.out.println(list2); // Output: [Carrot, Tomato, Potato, Pumpkin, Zucchini]
        System.out.println(list2.subList(1, 3)); // Output: [Tomato, Potato]

//        Object[] list3 = list.toArray();
//        System.out.println(Arrays.toString(list3)); //
//        System.out.println(list3.getClass().getName()); // Output: []
        // Создаем итератор, начинающий с индекса 2
        ListIterator<String> iterator = list2.listIterator(1); // list2 = [Carrot, Tomato, Potato, Pumpkin, Zucchini]

        // Выводим итератор
        System.out.println(iterator); // Это выведет что-то вроде: java.util.ArrayList$Itr@someHashCode

        // Если мы хотим видеть элементы, начиная с индекса 2, мы можем сделать так:
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // Tomato, Potato, Pumpkin, Zucchini
        }
    }

    public static void Task1(List<String> list) {
        // Создание списка и добавление элементов
        System.out.println("Task1: Создание списка и добавление элементов");

        list.add("Apple");
        list.add("Banana");
        list.add("Peach");

        // Вывод списка на экран
        System.out.println(list);
    }

    public static void Task2(List<String> list) {
        // Итерация по списку
        System.out.println("Task2: Итерация по списку");

        list.add("Apple");
        list.add("Banana");
        list.add("Peach");

        // Использование for-each
//        for (String fruit : list) {
//            System.out.println(fruit);
//        }

        // Использование итератора
//        ListIterator<String> iterator = list.listIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        // Использование for i
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }

    public static void Task3(List<String> list) {
        // Добавление и удаление элементов
        System.out.println("Task3: Добавление и удаление элементов");

        list.add("Apple");
        list.add("Banana");
        list.add("Peach");

        // Добавление элемента в конец списка
        list.add("Pear");

        // Вывод списка на экран после пополнения
        System.out.println("Список после пополнения: " + list);

        // Удаление первого вхождения элемента
        list.remove("Apple");
        // Вывод списка на экран после удаления элемента
        System.out.println("Список после удаления Apple: " + list);

        // Удаление всех вхождений элемента
        list.remove("Banana");
        // Вывод списка на экран после удаления элемента
        System.out.println("Список после удаления Banana: " + list);
    }

    public static void Task4(List<String> list) {
        // Изменение элемента по индексу [~~метод set(index, element)~~]
        System.out.println("Task4: Изменение элемента по индексу");

        list.add("Table");
        list.add("Sofa");
        list.add("Wardrobe");

        // Вывод списка на экран до изменения
        System.out.println("Список до изменения: " + list);

        // Изменение элемента с индексом 1
        list.set(1, "Chair");

        // Вывод списка на экран после изменения
        System.out.println("Список после изменения: " + list);
    }

    public static void Task5(List<String> list) {
        // Поиск индекса элемента
        System.out.println("Task5: Поиск индекса элемента");

        list.add("Table");
        list.add("Sofa");
        list.add("Wardrobe");

        // Вывод списка на экран до поиска индекса
        System.out.println("Список до поиска индекса: " + list);

        // Поиск индекса элемента "Sofa"
        int index = list.indexOf("Sofa");
        // Вывод индекса на экран
        System.out.println("Индекс элемента Sofa: " + index);
    }
}
