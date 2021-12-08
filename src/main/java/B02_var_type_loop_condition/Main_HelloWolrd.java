/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package B02_var_type_loop_condition;

/**
 *
 * @author MSI - MEDIAMART
 */
public class Main_HelloWolrd {

    /**
     * @param args the command line arguments
     */
    /*hàm main sẽ tìm đến hàm tương ứng để chạy code*/
    public static void main(String[] args) {
        System.out.println("Hello World");
        int sum = summary(2,4);
        System.out.println(sum);
        System.out.println(summary(3, 4));
        System.out.println(summary(3.5, 2.5));

    }

    private static int summary(int a, int b){
        System.out.println("int version");
        return a + b;
    }
    //overloading
    private static double summary(double a, double b){
        System.out.println("double version");
        return a + b;
    }

}
