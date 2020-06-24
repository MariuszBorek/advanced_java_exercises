package org.oopexercises.zad_2;

import org.oopexercises.zad_2.enums.Specialization;

public class Lecturer extends Person {
    protected Specialization specialization;
    protected int salary;

    public Lecturer(String name, String address, Specialization specialization, int salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public int getSalary() {
        return salary;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String hobby(String hobby) {
        return hobby;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "specialization=" + specialization +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
