import java.util.ArrayList;

public class PerviyClass {
     ArrayList<String>students = new ArrayList<>();


    Lessons lessons = new Lessons("Математика", "Русский язык", "Литература");

    public PerviyClass(ArrayList<String> students) {
        this.students = students;
    }
}
