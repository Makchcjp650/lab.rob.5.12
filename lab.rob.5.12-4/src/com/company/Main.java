package com.company;

public class Main {

    public static void main(String[] args) {
        int x1[] = new int[10];
        int x2[] = new int[10];
        int x3[] = new int[10];
        for (int i = 0; i < x1.length; i++){
            x1[i] = (int)(Math.random() * 10);
            x2[i] = (int)(Math.random() * 10);
            x3[i] = x1[i] + x2[i];
        }
        for (int i = 0; i < x1.length; i++)
            System.out.println(x1[i] + "-");
        System.out.println();

        for (int i = 0; i < x2.length; i++)
            System.out.println(x2[i] + "-");
        System.out.println();

        for (int i = 0; i < x3.length; i++)
            System.out.println(x3[i] + "-");
        System.out.println();
    }
}
