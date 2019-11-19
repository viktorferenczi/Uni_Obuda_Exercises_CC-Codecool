package com.company;

public class third_exercise {
    void triangle(double a,double b, double c){
        if ( (a+b>c) & (a+c>b) & (b+c>a) ){
            System.out.println("A haromszog szerkesztheto!");
        } else{
            System.out.println("A haromszog nem szerkesztheto!");
        }
    }
}
