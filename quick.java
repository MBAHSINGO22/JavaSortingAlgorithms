package jawa;

import java.util.Random;

public class quick {
    public int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {

            if (a[j] <= pivot) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }

    public void sort(int a[], int l, int h) {
        if (l < h) {
            int pi = partition(a, l, h);

            sort(a, l, pi - 1);
            sort(a, pi + 1, h);
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
        
        quick obj = new quick();
        obj.sort(data, 0, number - 1);
        
        long end = System.nanoTime();
        // Menghitung hasil running program
        long time = (end - start)/1000000;

        System.out.println("\nAfter Sorting : ");
        for (int i = 0; i < number; i++) {
            System.out.print(data[i] + " \s");
        }

        System.out.println("\nTime taken : " + time + " ns");
    }
}
