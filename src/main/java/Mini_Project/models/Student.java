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
    private String address;
    private String phone;

    private double diemToan;
    private double diemVan;
    private double diemAnh;
    private double c;
    private double english;
    private double java;

    //constructor

    public Student() {

    }

    public Student(int id, String name, String klass, String address, String phone) {
        this.id = id;
        this.name = name;
        this.klass = klass;
        this.address = address;
        this.phone = phone;
    }

    public Student input(Scanner sc){
        System.out.println("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter full name: ");
        String name = sc.nextLine();

        System.out.println("Enter class: ");
        String klass = sc.nextLine();

        System.out.println("Enter address: ");
        String address = sc.nextLine();

        System.out.println("Enter number phone: ");
        String phone = sc.nextLine();


        return new Student(id, name, klass, address, phone);
    }
    public void edit(Scanner sc) {

        System.out.println("Enter new name: ");
        this.name = sc.nextLine();

        System.out.println("Enter new class: ");
        this.klass = sc.nextLine();

        System.out.println("Enter new address: ");
        this.address = sc.nextLine();

        System.out.println("Enter new numer phone: ");
        this.phone = sc.nextLine();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }



//    @Override
//    public String toString() {
//        return id + " | " + name + " | " + klass + " | " + age + " | " + address;
//    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + klass + ", " + address + ", " + phone;
    }



}
