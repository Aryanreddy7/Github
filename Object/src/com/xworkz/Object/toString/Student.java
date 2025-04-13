package com.xworkz.Object.toString;

public class Student {
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", major='" + major + "'}";
    }
    @Override
    public int hashCode() {
        return 69;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Student) {
                System.out.println("Comparing!!!!!!");
                Student student = this;
                Student student1 = (Student) obj;
                if (student.name.equals(student1.name) && student.age == student1.age && student.major.equals(student1.major)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
