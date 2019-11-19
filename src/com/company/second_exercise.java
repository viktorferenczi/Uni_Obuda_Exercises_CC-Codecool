package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class second_exercise {
    void descending(int number1, int number2, int number3){
        List<Integer> container = Arrays.asList(number1,number2,number3) ;

        Collections.sort(container);
        Collections.reverse(container);
        System.out.println("The result is: " +container);
    }
}
