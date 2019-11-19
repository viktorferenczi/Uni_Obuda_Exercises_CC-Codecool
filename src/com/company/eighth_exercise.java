package com.company;

public class eighth_exercise {
    void lapatlo(double a,double b,double c){
        double lapatlo_l = Math.sqrt((a*a)+(b*b));
        double lapatlo_k = Math.sqrt((b*b)+(c*c));
        double lapatlo_t = Math.sqrt((a*a)+(c*c));
        System.out.println("Az l atlo: "+lapatlo_l);
        System.out.println("A k atlo: "+lapatlo_k);
        System.out.println("A t atlo: "+lapatlo_t);
    }
    void testatlo(double a,double b,double c){
        double testatlo = Math.sqrt((a*a)+(b*b)+(c*c));
        System.out.println("A testatlo: "+testatlo);
    }
    void felszin(double a,double b,double c){
        double felszin = 2*(a*b+a*c+b*c);
        System.out.println("A felszin: "+felszin);
    }
    void terfogat(double a,double b,double c){
        double terfogat = a*b*c;
        System.out.println("A terfogat: "+terfogat);
    }
}
