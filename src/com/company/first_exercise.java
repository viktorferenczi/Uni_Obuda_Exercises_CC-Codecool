package com.company;

public class first_exercise{
    void circumference(double userinput){
        double result = 2 * userinput;
        System.out.println("The circumference is : " +result);
    }
    void area(double userinput){
        double result = 3.14 * Math.pow(userinput,userinput);
        System.out.println("The area is: " +result);
    }
    void sphere_area(double userinput){
        double result = 4 * Math.pow(userinput,userinput) * 3.14;
        System.out.println("The sphere area is: " +result);
    }
    void sphere_volume(double userinput){
        double result = 4 * (userinput*userinput*userinput) * 3.14 / 3;
        System.out.println("THe spehere volume is: " +result);
    }
}
