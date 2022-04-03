package com.company;

public class Main {

    public static void main(String[] args) {
        int x1[] = new int[5];
        int x2[] = new int[5];
        int x3[] = new int[5];
        double y1 = 0, y2 = 0, y3 = 0;
        for (int i = 0; i < 5; i++) {
            x1[i] = (int) (Math.random() * 5);
            x2[i] = (int) (Math.random() * 5);
            x3[i] = (int) (Math.random() * 5);
            y1 += x1[i];
            y2 += x2[i];
            y3 += x3[i];
        }
        y1 /= 5;
        y2 /= 5;
        y3 /= 5;
        for (int i = 0; i < 5; i++){
            System.out.println(x1[i] + "-");
        }
        System.out.println("y1" + y1);
        System.out.println();

        for (int i = 0; i < 5; i++){
            System.out.println(x2[i] + "-");
        }
        System.out.println("y2" + y2);
        System.out.println();

        for (int i = 0; i < 5; i++){
            System.out.println(x3[i] + "-");
        }
        System.out.println("y3" + y3);
        System.out.println();

        if (y1 > y2 | y1 > y3){
            System.out.println("y1");
        }
        else if (y2 > y3){
            System.out.println("y2");
        }
        else if (y1 == y2){
            System.out.println("y1=y2");
        }
        else if (y1 == y3){
            System.out.println("y1=y2");
        }
        else if (y2 == y3){
            System.out.println("y2=y3");
        }
        else {
            System.out.println("y1=y2=y3");
        }

    }
}
