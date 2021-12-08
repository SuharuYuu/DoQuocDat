/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package B10_Encapsulation;

/**
 *
 * @author MSI - MEDIAMART
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee employee = new Employee("", "","");

        employee.setName("Dat");
        employee.setEmail("ggg@gmgm.c");
        employee.setPhoneNum("012323");
        System.out.println(employee.getName());
        System.out.println(employee.getEmail());
        System.out.println(employee.getPhoneNum());
    }

}
