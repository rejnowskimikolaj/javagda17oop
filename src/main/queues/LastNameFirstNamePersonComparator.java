package main.queues;

import java.util.Comparator;

public class LastNameFirstNamePersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int lastNameComparingResult = p1.getLastName().compareTo(p2.getLastName());
        if(lastNameComparingResult!=0) return lastNameComparingResult;

        int firstNameComparingResult = p1.getFirstName().compareTo(p2.getFirstName());
        return firstNameComparingResult;

    }
}
