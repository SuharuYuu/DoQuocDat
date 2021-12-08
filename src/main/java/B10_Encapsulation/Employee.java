/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_Encapsulation;

/**
 *
 * @author MSI - MEDIAMART
 */
public class Employee {
    private String name;
    String email;
    private String PhoneNum;


    public Employee(String name, String email, String PhoneNum) {
        this.name = name;
        this.email = email;
        this.PhoneNum = PhoneNum;
    }

    public String getPhoneNum(){
        return PhoneNum;
    }
    public void setPhoneNum(String PhoneNum){
        this.PhoneNum = PhoneNum;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
