package com.company;

public class fifth_exercise {
    void add(double number1, double number2){
        double add = number1 + number2;
        System.out.println("Osszege: "+ add);
    }
    void sub(double number1, double number2){
    if(number1 > number2){
        double sub = number1 - number2;
        System.out.println("Kulonbsege: "+ sub);
    }else if(number1 < number2){
        double sub = number2 - number1;
        System.out.println("Kulonbsege: "+ sub);
    }
    }
     void multi(double number1, double number2){
         double mutli = number1 * number2;
         System.out.println("Szorzata: "+ mutli);
     }
     void div(double number1, double number2){
         double div = number1 / number2;
         System.out.println("Hanyadosa: "+ div);
     }
}
