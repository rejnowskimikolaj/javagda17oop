package main.queues;

import java.util.Comparator;

public class LastNamePersonComparator implements Comparator<Person> {
    //wg nazwiska (natural order)
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getLastName().compareTo(p2.getLastName());
    }
}
