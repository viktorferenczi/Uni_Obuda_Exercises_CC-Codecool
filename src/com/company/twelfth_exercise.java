package com.company;

public class twelfth_exercise {
    void num_len(int number) {
        if (number > 9 & number < 100) {
            System.out.println("A szam ket jegyu!");
        } else if (number < 10) {
            System.out.println("A szam egy jegyu!");
        } else if (number > 99 & number<1000) {
            System.out.println("A szam harom jegyu!");
        } else if (number > 999 & number<10000) {
            System.out.println("A szam negy jegyu!");
        } else if (number > 9999 & number<100000) {
            System.out.println("A szam ot jegyu!");
        } else if (number > 99999 & number<1000000) {
            System.out.println("A szam hat jegyu!");
        }
    }
}
