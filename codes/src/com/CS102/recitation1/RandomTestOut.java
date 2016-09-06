package com.CS102.recitation1;

import java.util.Random;

/**
 * Created by Fred Fung on 9/6/2016.
 */
public class RandomTestOut {

    public static void main(String[] args) {
        Random r = new Random();
        for ( int i=0; i<20;i++) {
            System.out.println(r.nextDouble());
            System.out.println(r.nextBoolean());
            System.out.println(r.nextInt());
            System.out.println(flipCoin());
        }
    }

    // Any other way to implement this?
    private static String flipCoin (){
        Random r = new Random();
        if(r.nextDouble()<0.5){
            return "HEAD";
        } else {
            return "TAIL";
        }
    }
}
