package org.oopexercises.zad_2;

import org.oopexercises.zad_2.enums.Faculty;
import org.oopexercises.zad_2.enums.YearOfFaculty;

public class Student extends Person {
    protected Faculty faculty;
    protected YearOfFaculty yearOfFaculty;
    protected int cost;

    public Student(String name, String address, Faculty faculty, YearOfFaculty yearOfFaculty, int cost) {
        super(name, address);
        this.faculty = faculty;
        this.yearOfFaculty = yearOfFaculty;
        this.cost = cost;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public YearOfFaculty getYearOfFaculty() {
        return yearOfFaculty;
    }

    public int getCost() {
        return cost;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void setYearOfFaculty(YearOfFaculty yearOfFaculty) {
        this.yearOfFaculty = yearOfFaculty;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String studying(String whatYouStudy) {
        return whatYouStudy;
    }

    @Override
    public String hobby(String hobby) {
        return hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "faculty=" + faculty +
                ", yearOfFaculty=" + yearOfFaculty +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
