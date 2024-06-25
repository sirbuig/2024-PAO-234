package ex1;

public class Cat {
    String name;
    int age;
    Color color;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = Color.WHITE;
    }

    public Cat(String name, int age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat: name - " + name + ", age - " + age + ", color - " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (o instanceof Cat cat) {
            return name.equals(cat.name) && age == cat.age;
            //return name.equals(cat.name);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        char[] letters = name.toCharArray();

        int sum = 0;

        for (char c : letters) {
            sum += c;
        }
        return sum;
    }
}
