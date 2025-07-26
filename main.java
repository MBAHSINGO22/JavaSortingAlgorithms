package jawa;

import jawa.quick;
import jawa.select;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random rand = new Random();
        quick quickSort = new quick();
        select selecttionSort = new select();
        int jumlahData = 1000000;
        int data[] = new int[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            data[i] = rand.nextInt(10000000);
        }
        long start1 = System.nanoTime();
        quickSort.sort(data, 0, jumlahData - 1);
        long end1 = System.nanoTime();
        long time1 = (end1 - start1);
        System.out.println("Quick Sort Time for " + jumlahData + " data : " + time1 + " ms");

        long start2 = System.nanoTime();
        selecttionSort.sort(data);
        long end2 = System.nanoTime();
        long time2 = (end2 - start2);
        System.out.println("Selection Sort Time for " + jumlahData + " data : " + time2 + " ms");
    }

}
