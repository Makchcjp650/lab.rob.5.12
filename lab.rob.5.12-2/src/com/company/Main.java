package com.company;

public class Main {

    public static void main(String[] args) {
        int [] x = new int[20];
        for (int i = 0; i <x.length; i++ ) {
            x[i] = (int)( Math.random()*9);
            System.out.println(x[i] + "-");
        }
        System.out.println();
        for (int i = 0; i <x.length; i++) {
            if (i % 2 == 0)
                x[i] = 0;
            System.out.println(x[i] + '-');
        }
    }
}
