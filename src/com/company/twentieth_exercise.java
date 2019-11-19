package com.company;

public class twentieth_exercise {
    void cimlet(int amount){
        int[] arr = {10,5,2,1};
        for(int i=0;i<arr.length;i++){
            while(amount >= arr[i]){
                amount = amount - arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}
