package com.company;

public class thirteenth_exercise {
    void evszak(String honap){
        if(honap.equals("January") || honap.equals("February") || honap.equals("December") ){
            System.out.println("Tel!");
        } else if(honap.equals("March") || honap.equals("April") || honap.equals("May") ){
            System.out.println("Tavasz!");
        } else if(honap.equals("Jun") || honap.equals("July") || honap.equals("August") ){
            System.out.println("Tavasz!");
        } else if(honap.equals("September") || honap.equals("October") || honap.equals("November") ){
            System.out.println("Osz!");
        }
    }
}
