package Queues;

import java.util.*;

public class Practice {
    public static void Exercise() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        };

        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void Task1(Queue<Integer> queue) {
        // Создание очереди и добавление элементов
        System.out.println("Task1: Создание очереди и добавление элементов");

        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Вывод очереди на экран
        System.out.println("Очередь: " + queue);

        // Поочередный вывод элементов
        System.out.println("Поочередный вывод элементов: ");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
