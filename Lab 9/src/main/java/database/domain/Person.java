package database.domain;

public class Person {

    private final int id;

    private final String name;

    private final double age;

    public Person(int id, String name, double age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(String name, double age) {
        this(0, name, age);
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
