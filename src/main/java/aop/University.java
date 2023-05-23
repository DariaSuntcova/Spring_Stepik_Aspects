package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Daria Suntsova", 3, 4.75);
        Student student2 = new Student("Freddy Merric", 2, 3.90);
        Student student3 = new Student("Alla Lips", 5, 4.45);


        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("Info from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
