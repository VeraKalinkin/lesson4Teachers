import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherController implements UserController<Teacher>{
    List<Teacher> teachers = new ArrayList<>();

    UserView<Teacher> teacherUserView = new UserView<Teacher>();

    @Override
    public void create(String firstName, String secondName, String lastName) {

        int maxId = 0;
        if (!teachers.isEmpty())
            maxId = teachers.get(teachers.size() - 1).getTeacherIdtId() + 1;

        Teacher teacher = new Teacher(maxId, firstName, secondName, lastName);
        teachers.add(teacher);
    }

    public void change(Teacher teacher){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Изменить фамилию - 1 '\n' Изменить имя - 2 '\n' Изменить отчество - 3");
        int operation = scanner.nextInt();
        System.out.println("Введите новые данные: ");
        String newName = scanner.next();
        scanner.close();
        switch (operation){
            case(1):
                teacher.setFirstName(newName);
                break;
            case(2):
                teacher.setSecondName(newName);
                break;
            case(3):
                teacher.setName(newName);
        }
    }

    void printTeacherList(){
        teacherUserView.sendOnConsole(teachers);
    }
}
