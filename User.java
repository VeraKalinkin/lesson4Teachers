public class User {
    private String firstName;
    private String secondName;
    private String name;

    public User(String firstName, String secondName, String name) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                " firstName=' " + firstName + '\'' +
                ", secondName=' " + secondName + '\'' +
                ", name=' " + name + '\'' +
                '}';
    }
}
