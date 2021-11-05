package B07_basics;

import java.util.Scanner;

public class exercise_b07 {

    /* nhập số nguyên N, nhâp array[N]
    Tính và in ra tổng các phần tử
    Tính tổng các giai thừa (1! + 2! + 3! + ..+N!)
    N! = N * (N-1)* .... * 2 * 1
    sắp xếp theo thứ tự tăng dần

    */
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Nhap vao 1 so");
        int N = number.nextInt();
        number.nextLine();

        float[] arr = new float[N];
        float sum = 0;

        for(int i = 0; i < N; i++){
            System.out.println("Nhap vao gia tri phan tu thu "+(i+1));
            arr[i] = number.nextFloat();
        }
        number.nextLine();
        for(int i = 0; i< N; i++){
            sum += arr[i];

        }
        float TongGiaiThua = 0;
        System.out.println("Tong cac phan tu: "+sum);
        for(int i = 0; i<N;i++){
            TongGiaiThua += giaiThua(arr[i]);
            System.out.println("Giai thua: "+giaiThua(arr[i]));
        }
        System.out.println("Tong cac giai thua: "+TongGiaiThua);

        float maxNum = arr[0];
        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                if(arr[i] > arr[j]){
                    maxNum = arr[j];
                    arr[j] = arr[i];
                    arr[i] = maxNum;
                }
            }
        }
        System.out.println("Day so tang dan: ");
        SapXep(arr);

    }
    public static void SapXep(float[] SX) {
        for(int i = 0; i < SX.length; i++){
            System.out.println((i+1)+": "+SX[i]);
        }
    }
    public static float giaiThua(float GT){
        float giaithua = 1;
        for(int i = 1; i<=GT; i++){
            if(GT!=1){
                return GT*giaiThua(GT-1);
            }else{
                return 1;
            }
        }
        return 0;
    }
}
