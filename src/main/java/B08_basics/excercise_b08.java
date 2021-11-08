package B08_basics;

import java.util.Scanner;

public class excercise_b08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);

        System.out.println("Input max array: ");
        int N = inPut.nextInt();
        int[] phanTu = new int[N];
        for(int i = 0; i < N; i++){
            phanTu[i] = inPut.nextInt();
        }
        arrayOutput(N);

        int Max = phanTu[0];
        System.out.println("Max number: ");
        MaxNum(Max, N, phanTu);

        int Min = phanTu[0];
        System.out.println("Min number: ");
        MinNum(Min, N, phanTu);
    }
    public static void MaxNum(int Max, int N, int[] arr) {
        for(int i = 0; i < N; i++){
            if(Max < arr[i]){
                Max = arr[i];
            }
        }
        System.out.println("Max: "+Max);
    }
    public static void MinNum(int Min, int N, int[] arr){
        for(int i = 0; i< N; i++){
            if(Min > arr[i]){
                Min = arr[i];
            }
        }
        System.out.println("Min: "+Min  );
    }
    public static void arrayOutput(int N){
        

    }
}
