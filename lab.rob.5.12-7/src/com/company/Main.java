package com.company;

public class Main {

    public static void main(String[] args) {
        int[] [] array = new int [7] [7];
        int[]x = new int[7];
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 6);
                System.out.print(array[i][j] + "");
                x[1] += array[i][j];
            }
            System.out.print("=" + x[i]);
            System.out.println();
        }
        for (int i = 0, j = 0; i < x.length; i++) {
            if(x[i] >= j){
                y = i;
                j = x[i];
            }
        }
        System.out.println("Індекс стрічки ,сума елементів якої має найбільше значення " + "y");
     }
}
