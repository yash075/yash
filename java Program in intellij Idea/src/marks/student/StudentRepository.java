package marks.student;

import java.util.ArrayList;

public class StudentRepository {
    private ArrayList<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    public void add(String name,int... marks){
        Student std = new Student(name,new ArrayList<>());
        for (int m : marks) {
            std.getMarks().add(m);
        }
        students.add(std);
    }

    public void print() {
        for (Student s : students) {
            System.out.println(s.getName()+" ");
            int total = 0;
            for (int m : s.getMarks()) {
                System.out.println(" "+m);
                total = total + m;
            }
            System.out.print(" "+total+"\n");
        }
    }
}