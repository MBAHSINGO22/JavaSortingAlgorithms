package jawa;

import java.util.Random;

public class select {
    public void sort(int a[]) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_idx])
                    min_idx = j;
            }

            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int number = 1000;
        int data[] = new int[number];

        for (int i = 0; i < number; i++) {
            data[i] = rand.nextInt(100);
        }

        System.out.println("Before Sorting : ");
        for (int i = 0; i < number; i++) {
            System.out.print(data[i] + " \s");
        }

        long start = System.nanoTime();
        
        select obj = new select();
        obj.sort(data);
        
        long end = System.nanoTime();
        // Menghitung hasil running program
        long time = (end - start)/1000000;

        System.out.println("\nAfter Sorting : ");
        for (int i = 0; i < number; i++) {
            System.out.print(data[i] + " \s");
        }

        System.out.println("\nTime taken : " + time + " ms");
    }

}
