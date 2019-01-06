package marks.student;

public class App {

    public static void main (String []args) {
        StudentRepository rep = new StudentRepository();
        rep.add("Reena",40,20,60);
        rep.add("yash",89,56);
        rep.add("meet");
        rep.print();
    }
}
