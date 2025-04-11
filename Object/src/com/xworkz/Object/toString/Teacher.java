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
}
