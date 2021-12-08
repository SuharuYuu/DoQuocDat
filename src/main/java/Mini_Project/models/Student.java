/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mini_Project.models;

import java.util.Scanner;


public class Student {
    //fields
    private int id;
    private String name;
    private String klass;
    private String age;
    private String address;

    private double c;
    private double java;
    private double eSM;

    //constructor

    public Student() {

    }

    public Student(int id, String name, String klass, String age, String address) {
        this.id = id;
        this.name = name;
        this.klass = klass;
        this.age = age;
        this.address = address;

    }

    public Student input(Scanner sc){
        System.out.println("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter full name: ");
        String name = sc.nextLine();

        System.out.println("Enter class: ");
        String klass = sc.nextLine();

        System.out.println("Enter age: ");
        String age = sc.nextLine();

        System.out.println("Enter address: ");
        String address = sc.nextLine();

        return new Student(id, name, klass, age, address);
    }
    public void edit(Scanner sc) {

        System.out.println("Enter new name: ");
        this.name = sc.nextLine();

        System.out.println("Enter new class: ");
        this.klass = sc.nextLine();

        System.out.println("Enter new address: ");
        this.address = sc.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double geteSM() {
        return eSM;
    }

    public void seteSM(double eSM) {
        this.eSM = eSM;
    }

//    @Override
//    public String toString() {
//        return id + " | " + name + " | " + klass + " | " + age + " | " + address;
//    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + klass + ", " + age + ", " + address;
    }



}
