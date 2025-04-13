package com.xworkz.Object.toString;

public class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + "}";
    }
    @Override
    public int hashCode() {
        return 27;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Employee) {
                System.out.println("Comparing!!!!!!");
                Employee employee = this;
                Employee employee1 = (Employee) obj;
                if(employee.name.equals(employee1.name)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
