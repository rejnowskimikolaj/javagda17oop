package main.queues;

import java.util.Comparator;

public class OddOrEvenComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer number1, Integer number2) {
        int number1Modulo = number1%2;
        int number2Modulo = number2%2;
        if(number1Modulo==0&&number2Modulo!=0)return -1;
        if(number1Modulo!=0&&number2Modulo==0)return 1;
        return 0;
    }
}
