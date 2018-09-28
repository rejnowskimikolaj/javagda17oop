package main.queues;

import java.time.LocalDate;
import java.util.Comparator;

public class LocalDateComparator implements Comparator<LocalDate> {
    @Override
    public int compare(LocalDate d1, LocalDate d2) {
        if(d1.isAfter(d2)) return 1;
        if(d1.isBefore(d2)) return -1;
        return 1;
    }
}
