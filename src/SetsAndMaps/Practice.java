package SetsAndMaps;

import java.util.*;

public class Practice {
    public static void Exercise() {
        // Set хранит уникальные неупорядоченные элементы
        Set<String> set = new HashSet<>();

        set.add("Milk");
        set.add("Water");
        set.add("Coffee");
        set.add("Tea");

        System.out.println("Неупорядоченный сет: " + set);

        set.forEach(System.out::println);

        // Массив, в котором хранятся пары - ключ: значение
        Map<String, String> map = new HashMap<>();

        map.put("Apple", "red");
        map.put("Banana", "yellow");
        map.put("Watermelon", "green");

        map.forEach((key, value) -> System.out.println(key + " is " + value));

        // Получение всех ключей и значений из Map
        System.out.println("Получение всех ключей из Map");

        for (String key: map.keySet()) {
            System.out.println(key);
        }

        System.out.println("Получение всех значений из Map");

        for (String value: map.values()) {
            System.out.println(value);
        }

        System.out.println("Получение пары ключ-значение из Map");
        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Выводим словарь
        System.out.println("Словарь/Map: " + map);

        // Получить значение по ключу
        String valueByKey = map.get("Apple");
        System.out.println("Значение ключа 'Apple': " + valueByKey);

        // Удаление элемента по ключу
        map.remove("Apple");
        System.out.println("Словарь после удаления ключа 'Apple': " + map);

        //TreeSet
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Milk");
        treeSet.add("Water");
        treeSet.add("Coffee");
        treeSet.add("Tea");

        System.out.println("TreeSet упорядоченный: " + treeSet);

        System.out.println("Вывод каждого элемента treeSet: ");
        treeSet.forEach(System.out::println);
    }
}
