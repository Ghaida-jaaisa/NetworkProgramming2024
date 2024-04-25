/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.io.*;
import java.util.Random;

/**
 *
 * @author user
 */
class Testing extends Thread {
    int n, m;
    private int sum = 0;
    private int size;
    volatile private boolean finish = false;
    int arr[];
    Testing(int arr[], int n, int m) {
        this.arr = arr;
        this.n = n;
        this.m = m;
    }
    int getSum() {
        return sum;
    }
    public void run() {
        for (int i = n; i < m; i++) {
            sum += arr[i];
        }
        finish = true;
    }
    public boolean isFinished() {
        return finish;
    }
}
public class Test4 {

    /* 
    25/4/2024 
    Task : you have an arary with size n , with two work threads , each thread have to calculate sum of half the array 
    then give it to main thread then print it in console . 
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader bufr = new BufferedReader(read);
        int size;
        size = Integer.parseInt(bufr.readLine());
        int arr[] = new int[size];
        Random random = new Random();

        for (int j = 0; j < size; j++) {
            arr[j] = (int) (Math.random() * 20);
            System.out.print(arr[j] + " ");
        }
        System.out.println("\n");
        Testing obj1 = new Testing(arr, 0, size / 2);
        Testing obj2 = new Testing(arr, size / 2, size);

        obj1.start();
        obj2.start();

        while (!obj1.isFinished() || !obj2.isFinished())   ;
        System.out.println(obj1.getSum());
        System.out.println(obj2.getSum());
    }

}
