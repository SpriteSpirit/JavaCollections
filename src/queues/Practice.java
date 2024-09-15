package queues;

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

    public static void Task2(Queue<String> queue) {
        // Создание очереди и добавление элементов
        /*
        В Java интерфейс Queue обычно реализуется через LinkedLists или PriorityQueue.
        Основные операции включают add()/offer() для добавления элементов,
        remove()/poll() для извлечения и peek() для просмотра первого элемента без удаления.
         */

        System.out.println("Task2: Создание очереди и добавление элементов");

        queue.offer("Cherry");
        queue.offer("Apple");
        queue.offer("Banana");

        // Вывод очереди на экран
        System.out.println("Очередь: " + queue);

        // Вывод
        System.out.println("Первый элемент: " + queue.peek()); // Возвращает Cherry
        System.out.println("Извлеченный  элемент: " + queue.poll()); // Возвращает и удаляет Cherry
        System.out.println("Очередь: " + queue);
        System.out.println("Первый элемент после извлечения: " + queue.peek()); // Возвращает Apple
        System.out.println("Очередь: " + queue);
    }

    public static void Task3(Queue<String> priorityQueue) {
        // PriorityQueue обеспечивает порядок элементов на основе естественного порядка или заданного компаратора.
        // В случае строк это будет лексикографический порядок
        System.out.println("Task3: Очередь с приоритетом (PriorityQueue)");

        priorityQueue.offer("Milk");
        priorityQueue.offer("Juice");
        priorityQueue.offer("Tea");
        priorityQueue.offer("Coffee");
        priorityQueue.offer("Water");

        System.out.println("Очередь с приоритетом:");

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }

    public static void Task4(Deque<String> stack) {
        System.out.println("Task4: Использование Deque как двусторонней очереди");
        // Двусторонняя очередь (Deque) предоставляет полный набор методов
        // для добавления и удаления элементов в начале и конце
        stack.addFirst("First");
        stack.add("Second");
        stack.addFirst("Third");
        stack.addLast("Last");

        // Вывод двусторонней очереди
        System.out.println("Очередь: " + stack);

        System.out.println("Удалить первый: " + stack.removeFirst());
        System.out.println("Удалить последний: " + stack.removeLast());
    }

    public static void Task5(Deque<String> stack) {
        System.out.println("Task5: Добавление и удаление элементов из двусторонней очереди");

        // Добавление и удаление элементов из двусторонней очереди
        stack.addFirst("1");
        stack.addFirst("2");
        stack.addFirst("3");
        stack.addFirst("4");

        stack.addLast("5");
        stack.addLast("6");
        stack.addLast("7");

        System.out.println("Удаление элементов из двусторонней очереди с начала:");

        // Удаление элементов из двусторонней очереди с начала
        // ВНИМАНИЕ! элементы с конца вывелись в другом порядке
        while (!stack.isEmpty()) {
            System.out.println(stack.pollFirst());
        }
        System.out.println("Очередь после удаления с начала: " + stack);

        stack.addLast("7");
        stack.addLast("6");
        stack.addLast("5");
        stack.addLast("4");

        stack.addFirst("3");
        stack.addFirst("2");
        stack.addFirst("1");

        System.out.println("Удаление элементов из двусторонней очереди с конца:");
        // Удаление элементов из двусторонней очереди с конца
        // ВНИМАНИЕ! элементы с конца вывелись в другом порядке
        while (!stack.isEmpty()) {
            System.out.println(stack.pollLast());
        }
        System.out.println("Очередь после удаления с конца: " + stack);
    }

    public static void Task6(Queue<Integer> queue) {
        // Проверка наличия элемента в очереди
        System.out.println("Task6: Проверка наличия элемента в очереди");

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Есть ли 2 в очереди? " + queue.contains(2)); // true
        System.out.println("Есть ли 4 в очереди? " + queue.contains(4)); // false

        // Получение индекса первого вхождения элемента в очереди через список
        int elementIndex = ((LinkedList<Integer>) queue).indexOf(2);
        System.out.println("Индекс первого вхождения 2 в очереди: " + elementIndex); // 1

    }
}
