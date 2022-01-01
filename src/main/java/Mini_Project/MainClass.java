package Mini_Project;

import Mini_Project.controller.StudentManager;
import Mini_Project.dataservices.StudentDataServices;
import Mini_Project.models.Student;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainClass {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException     {

        //read
        StudentDataServices service = new StudentDataServices();

        List<Student> students = service.read("./resources/students-input.txt");

        String choose = null;
        boolean exit = false;
        StudentManager studentManager = new StudentManager("./resources/students-input.txt");

        showMenu();

        while (true) {
            choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    System.out.println("Add book: ");
                    studentManager.addStudent(scanner);
                    break;
                case "2":
                    System.out.println("Edit student: ");
                    studentManager.editStudent(scanner);
                    break;
                case "3":
                    System.out.println("Delete student: ");
                    studentManager.deleteStudent(scanner);
                    break;
                case "4":
                    System.out.println("Sort students by id ");
                    studentManager.sortById();
                    break;
                case "5":
                    System.out.println("Sort students by name ");
                    studentManager.sortByName();
                    break;
                case "6":
                    System.out.println("Students");
                    studentManager.showAll();
                    break;
                case "0":
                    System.out.println("Exit");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }

            if (exit) {
                break;
            }

            showMenu();
        }


        //write

    }
    public static void showMenu() {
        System.out.println("-----------------Menu------------------");
        System.out.println("1. Add student");
        System.out.println("2. Edit student");
        System.out.println("3. Delete student");
        System.out.println("4. Sort students by id");
        System.out.println("5. Sort students by name");
        System.out.println("6. Show all students");
        System.out.println("0. Exit");
        System.out.println("---------------------------------------");
        System.out.println("Please choose: ");
    }
}


