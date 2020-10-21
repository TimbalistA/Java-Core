package javaCore;

import java.util.ArrayList;

import static javaCore.Gender.FEMALE;
import static javaCore.Gender.MALE;

public class Person {

    private final String name;

    private final int age;

    private final Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static void parseArray(Object[] array) {
        ArrayList<Person> people = new ArrayList<>();
        StringBuilder string = new StringBuilder();
        int sum = 0;

        for (final Object object : array) {
            if (object instanceof Person) {
                people.add((Person) object);
            } else if (isNumeric(object.toString())) {
                sum += Double.parseDouble(object.toString());
            } else {
                string.append(object);
            }
        }
        System.out.println(string);
        System.out.println(sum);
        System.out.println(people);
    }

    public static boolean isNumeric(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Object[] array = new Object[] { "Today", 12334, new Person("Test", 25, FEMALE), new Person("Test", 5, MALE) };
        parseArray(array);
    }

}
