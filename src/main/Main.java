package main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(-1,0,2,18-4);
//
//        if(list.size()>0){
//            int max = list.get(0);
//            for (Integer integer : list) {
//                if(integer>max) max=integer;
//            }
//
//            System.out.println(max);
//        }
//        else{
//            System.out.println("list is empty! r u srs?");
//        }
//

        Scanner scanner = new Scanner(System.in);

        while(true){
            String line = scanner.nextLine();
            if(line.equals("yo")) System.out.println("yo yourself");
            else break;
        }
        System.out.println("end");

    }
}
