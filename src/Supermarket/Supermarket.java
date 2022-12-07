package Supermarket;

import java.util.*;

public class Supermarket {
    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 2;
    private static final List<String> NAMES = List.of(
            "Галина Петровна",
            "Ольга Тимофеевна",
            "Аркадий Игнатьевич",
            "Михаил Викторович",
            "Петр Сергеевич",
            "Елизовета Николаевна",
            "Дмитрий Владимирович",
            "Тарас Юрьевич",
            "Евгения Александровна",
            "Мария Ивановна"
    );


    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        Queue<String> queue3 = new ArrayDeque<>();
        randomFilling(queue1);
        randomFilling(queue2);
        randomFilling(queue3);
        System.out.println("Касса 1:" + queue1);
        System.out.println("Касса 2:" + queue2);
        System.out.println("Касса 3:" + queue3);
        System.out.println(queue1.size() + " " + queue2.size() + " " + queue3.size());
        add("Илья 1 ", queue1, queue2, queue3);
        add("Леонид 2", queue1, queue2, queue3);
        add("Семён 3", queue1, queue2, queue3);
        System.out.println("Касса 1:" + queue1);
        System.out.println("Касса 2:" + queue2);
        System.out.println("Касса 3:" + queue3);
        System.out.println(queue1.size() + " " + queue2.size() + " " + queue3.size());

        remove(queue2,queue3);
        System.out.println("Касса 1:" + queue1);
        System.out.println("Касса 2:" + queue2);
        System.out.println("Касса 3:" + queue3);

    }

    private static void add(String string, Queue<String> queue1, Queue<String> queue2, Queue<String> queue3) {
        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE && queue3.size() == MAX_SIZE) {
            System.out.println("Откройте кассу №3");
            return;
        }
        if (queue1.size() < queue2.size() && queue1.size() < queue3.size()) {
            queue1.offer(string);
        } else if (queue2.size() < queue1.size() && queue2.size() < queue3.size()) {
            queue2.offer(string);
        } else  {
            queue3.offer(string);

        }

    }


    private static void remove(Queue<String> queue1, Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }

    private static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));

        }
    }
}
