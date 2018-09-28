package main.queues;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        //queue - Kolejka - najczesciej FIFO - first in, first out
//        //jak kolejka w poczekalni
//
//        //najpopularniejsza implementacja kolejki FIFO to LinkedLista
//        Queue<String> queue = new LinkedList<>();
//        //dodajemy elementy metoda add()
//        queue.add("1");
//        queue.add("2");
//        queue.add("3");
//        //poczatek kolejki to HEAD (glowa)
//        //  HEAD->1,2,3 <-TAIL
//        //koniec kolejki to TAIL (ogon)
//        System.out.println(queue);
//        //remove zwraca pierwszy element, jednoczesnie usuwajac go z kolejki (HEAD)
//        queue.remove();
//        queue.remove();
//        System.out.println(queue);
//        queue.remove();
////        jesli nie ma juz zadnego elementu, remove rzuci Exception
////        queue.remove();  //<-rzuci exception
////
//        //zamiast remove(), mozemy uzywac
//
//        queue.poll();
//
//        //poll zwraca nulla, zamiast rzucac exception
//        System.out.println(queue.poll());
//
//        //mamy tez peek(), ktory "podglada glowe" - czyli zwraca, ale nie usuwa z kolejki
//
//        queue.add("1");
//        queue.add("2");
//        queue.add("3");
//
//        System.out.println(queue);
//        System.out.println(queue.peek());
//        Sy
// stem.out.println(queue);
//
//        PriorityQueue dziala w podobny sposob, co zwykla Queue, ale przy wyciaganiu elementow,
//        bierze ten z najwyzszym priorytetem
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("aaa");
        priorityQueue.add("caaa");
        priorityQueue.add("baa");
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue);

//        w konstruktorze mozemy podac comparator. domyslnie, priority queue uzywa natural order
        priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add("aaa");
        priorityQueue.add("caaa");
        priorityQueue.add("baa");
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue);
//
//
        //stack - STOS - to struktura typu LIFO - last-in, first-out
        Stack<String> stack = new Stack<>();
        System.out.println("##########STACK###########");
        //zeby dodac element do stacka, uzywamy metody push()
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack);
        //pop zwraca kolejny element (HEAD)
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();

//        jesli stack jest pusty, to pop rzuci exception
//        stack.pop();

        //mamy tez peek(), ktory "podglada glowe" - czyli zwraca, ale nie usuwa z kolejki

    }
}
