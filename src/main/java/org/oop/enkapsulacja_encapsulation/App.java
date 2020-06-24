package org.oop.enkapsulacja_encapsulation;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Employee employee1 = new Employee("EXD345", "Marcin", "Lebiedzik", LocalDate.of(1992, 06, 23));

        System.out.println(employee1.getId());
        System.out.println(employee1.getFirstName());
        System.out.println(employee1.getLastName());
        employee1.setFirstName("Justyna");
        employee1.setLastName("Danel");
        System.out.println(employee1.getFirstName());
        System.out.println(employee1.getLastName());
        System.out.println(employee1.getDateOfBirth());
    }
}
