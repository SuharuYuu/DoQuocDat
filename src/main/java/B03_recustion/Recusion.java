/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package B03_recustion;

/**
 *
 * @author MSI - MEDIAMART
 */
public class Recusion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result = sum(3);
        System.out.println(result);
    }
    //Toán đệ quy: (1+2+3+...+k)
    public static int sum(int k){
        if(k>0){
            return k + sum(k-1);
        }else{
            return 0;
        }
    }
}
