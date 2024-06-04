public class Teacher extends User implements Comparable<Teacher>{
    private int teacherId;

    public Teacher(int teacherId, String firstName, String secondName, String name) {
        super(firstName, secondName, name);
    }

    public int getTeacherIdtId() {
        return teacherId;
    }


    @Override
    public String toString() {
        return "Teacher{ " +
                "teacherId = " + teacherId +
                super.toString() +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return Integer.compare(teacherId, o.getTeacherIdtId());
    }
}
