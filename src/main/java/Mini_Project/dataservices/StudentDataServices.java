package Mini_Project.dataservices;

import Mini_Project.models.Student;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI - MEDIAMART
 */


public class StudentDataServices {
    public List<Student> read(String path) throws IOException{

        List<Student> students = new ArrayList<>();

        //Path pathFileToRead = Paths.get("./resources/students-input.txt");
        Path pathFileToRead = Paths.get(path);
        List<String> allLines = Files.readAllLines(pathFileToRead);

        for(int i = 0; i < allLines.size(); i++){

            String line = allLines.get(i);
            String[] data = line.split(",");


            Student student = new Student(Integer.parseInt(data[0].trim()), data[1].trim(), data[2].trim(), data[3].trim(), data[4].trim());

            students.add(student);
        }

        return students;
    }
    public void write(String path, List<Student> students) throws IOException{
        //List<Student> => List<String>
        List<String> list = new ArrayList<>();
        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            list.add(student.toString());
        }

        //print to file
        Path pathFileToWrite = Paths.get(path);
        Files.write(pathFileToWrite, list);
    }
}
