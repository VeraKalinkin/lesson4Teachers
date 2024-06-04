import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.create("Abr", "Hnm", "Jkl");
        teacherController.create("Rtv", "Svb", "Fdr");
        teacherController.printTeacherList();
        teacherController.change(teacherController.teachers.get(1));
        teacherController.printTeacherList();
        }
}