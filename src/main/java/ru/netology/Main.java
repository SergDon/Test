package ru.netology;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Queue <Person> queuePerson = new ArrayDeque<>();
        for (Person p : generateClient()) {
            queuePerson.offer(p);
        }
        System.out.println("ВАУ!ВАУ!Карусель закрутилась!");
        System.out.println();

        while (!queuePerson.isEmpty()){
            if (queuePerson.peek().getNumberOfTickets() > 0){
                System.out.println((queuePerson.peek()) + ":  успешно прокатился!");
                queuePerson.peek().setNumberOfTickets(queuePerson.peek().getNumberOfTickets()-1);
                queuePerson.offer(queuePerson.poll());
            }
            else {
                System.out.println(queuePerson.poll()+ ":  билеты, к сожалению, закончились!");
            }
        }
        System.out.println();
        System.out.println("Ай-ай! Билеты у всех - закончились!!!");
    }

    public static List<Person> generateClient() {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("Алексей", "Гордиенко", 5));
        list.add(new Person("Андрей", "Даценко", 3));
        list.add(new Person("Оксана", "Резникова", 8));
        list.add(new Person("Виталик", "Яшенков", 4));
        list.add(new Person("Наталья", "Медведева", 1));
        return list;
    }
}