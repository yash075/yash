package marks.student;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> marks;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, ArrayList<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }
}
