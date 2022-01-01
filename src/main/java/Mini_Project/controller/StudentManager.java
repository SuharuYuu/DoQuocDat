/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mini_Project.controller;

import Mini_Project.dataservices.StudentDataServices;
import Mini_Project.models.Student;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MSI - MEDIAMART
 */
public class StudentManager {

    private List<Student> list;
    private final String pathFileToInput;
    private StudentDataServices service;

    public StudentManager(String pathFileToInput) {
        this.pathFileToInput = pathFileToInput;
        this.service = new StudentDataServices();
        try{
            this.list = service.read(pathFileToInput);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }



    public void sortByName(){

        Collections.sort(
                list,
                (s1, s2) -> s1.getName().compareTo(s2.getName()));
    }
    public void sortbyAddress(){
        Collections.sort(
                list,
                (s1, s2) -> s1.getAddress().compareTo(s2.getAddress()));
    }
    public void sortbyPhone() {
        Collections.sort(
                list,
                (s1, s2) -> s1.getPhone().compareTo(s2.getPhone()));
    }
    public void sortbyKlass () {
        Collections.sort(
                list,
                (s1, s2) -> s1.getKlass().compareTo(s2.getKlass()));
    }
    public void sortById(){
        Collections.sort(
                list,
                (s1, s2) -> Integer.compare(s1.getId(), s2.getId()));
    }
    public Student findByName(String name){
        for(Student s:list){
            if(s.getName().equals(name)){
                return s;
            }
        }
        return null;
    }
    public Student findById(int id){
        for(Student s: list){
            if(s.getId()==id){
                return s;
            }
        }
        return null;
    }
    public void addStudent(Scanner sc){
        list.add(new Student().input(sc));
    }
    public void editStudent(Scanner sc){
        System.out.println("Enter id: ");

        int id = sc.nextInt();
        sc.nextLine();// ignore new line

        Student student = findById(id);
        student.edit(sc);
    }

    public void deleteStudent(Scanner sc) {

        System.out.println("Enter id: ");

        int id = sc.nextInt();
        sc.nextLine();

        Student student = findById(id);
        list.remove(student);
    }

    public void showAll() {

        for(Student s: list) {
            System.out.println(s.toString());
        }
    }
}

/*
-- add();
-- edit();
-- delete();
-- sortStudentsByName();
-- sortStudentsByGPA();
*/