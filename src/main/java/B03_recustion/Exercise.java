/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package B03_recustion;

/**
 *
 * @author MSI - MEDIAMART
 */
public class Exercise {

    /**
     * @param args the command line arguments
     */
    //giai thừa
    public static void main(String[] args) {
        int result = factorial(6);
        int result2 = factorial2(4);
        System.out.println(result);
        System.out.println(result2);
    }
    //Toán đệ quy: (1+2+3+...+k)
    public static int factorial(int fac){
        int resultReturn = 1;
        for(int i = 1; i <= fac; i++){
            resultReturn = i * resultReturn;
        }
        return resultReturn;
    }

    public static int factorial2(int fac2){
        if(fac2 != 0){
            return (fac2*factorial2(fac2-1));
        }else{
            return 1;
        }
    }
