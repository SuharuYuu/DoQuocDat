/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package test;

import java.util.Scanner;

/**
 *
 * @author MSI - MEDIAMART
 */
public class test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array max num: ");
        int n = scanner.nextInt();

        int [] arr = new int [n];

        System.out.println("Input array num: \n");

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // sắp xếp dãy số theo thứ tự tăng dần
        sortASC(arr);
        show(arr);
    }

    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void search(int [] arr){
    }

}
