package be.continuum.data;

public class User {

    private final String surname;
    private final String name;

    private Integer age;

    public User(final String surname, final String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}