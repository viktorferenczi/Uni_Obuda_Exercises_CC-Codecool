package com.company;

public class nineteenth_exercise {
    void kave(String duplacuki, String habos, String pohar){
        int x = 100;
        //duplacuki x+20, habos x+50, pohar x-10
        if(duplacuki.equals("Igen")	|| duplacuki.equals("igen") ){
            x += 20;
        } else if(habos.equals("Igen")||habos.equals("igen")){
            x +=50;
        }  else if(pohar.equals("Igen")||pohar.equals("igen")){
            x -= 10;
        }
        System.out.println("The price will be: "+x+"Ft");
    }
}
