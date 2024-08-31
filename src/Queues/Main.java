package Queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import static Queues.Practice.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queueInt = new LinkedList<>();
        Queue<String> queueStr = new LinkedList<>();
        Queue<String> priorityQueueStr = new PriorityQueue<>();
        Deque<String> stack = new LinkedList<>();

        Task6(queueInt);

        /*
            Task1: Создание очереди и добавление элементов
            Task2: Базовые операции с очередью: извлечение и просмотр
            Task3: Очередь с приоритетом (PriorityQueue)
            Task4: Использование Deque как двусторонней очереди
            Task5: Добавление и удаление элементов из двусторонней очереди
            Task6: Проверка наличия элемента в очереди

         */
    }
}