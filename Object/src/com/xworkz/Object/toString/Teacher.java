package com.xworkz.Object.toString;

public class Teacher {
    private String name;
    private String subject;
    private int experience;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teacher{name='" + name + "', subject='" + subject + "', experience=" + experience + "}";
    }
    @Override
    public int hashCode() {
        return 72;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Teacher) {
                System.out.println("Comparing!!!!!!");
                Teacher teacher = this;
                Teacher teacher1 = (Teacher) obj;
                if (teacher.name.equals(teacher1.name) && teacher.subject.equals(teacher1.subject) && teacher.experience == teacher1.experience) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
