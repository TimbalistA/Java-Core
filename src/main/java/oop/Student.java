package oop;

public class Student {

    private String name;

    private int age;

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int averageAge(Student firstStudent, Student secondStudent) {
        return (firstStudent.getAge() + secondStudent.getAge()) / 2;
    }

    public static void main(String[] args) {
        Student firstStudent = new Student();
        Student secondStudent = new Student();
        firstStudent.setData("Ian", 25);
        secondStudent.setData("Ion", 23);

        System.out.println("The average age is " + averageAge(firstStudent, secondStudent));
    }

}
