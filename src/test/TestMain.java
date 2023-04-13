import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestMain {

    @Test
    void testGenerateClient() {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("Алексей", "Гордиенко", 5));
        list.add(new Person("Андрей", "Даценко", 3));
        list.add(new Person("Оксана", "Резникова", 8));
        list.add(new Person("Виталик", "Яшенков", 4));
        list.add(new Person("Наталья", "Медведева", 1));

        assertEquals(list, Main.generateClient());
    }

    @Test
    void testNumberOfTickets() {
        Person person = new Person("Иван", "Иванов", 3);

        assertEquals(3, person.getNumberOfTickets());

        person.setNumberOfTickets(5);

        assertEquals(5, person.getNumberOfTickets());
    }

    @Test
    void testQueuePerson() {
        Queue<Person> queuePerson = new LinkedList<>();
        queuePerson.add(new Person("Алексей", "Гордиенко", 5));
        queuePerson.add(new Person("Андрей", "Даценко", 3));
        queuePerson.add(new Person("Оксана", "Резникова", 8));

        assertEquals(queuePerson, Main.generateClient());
        assertTrue(queuePerson.contains(new Person("Алексей", "Гордиенко", 5)));
    }
}