package org.oopexercises.zad_2;

import org.oopexercises.zad_2.enums.Faculty;
import org.oopexercises.zad_2.enums.Specialization;
import org.oopexercises.zad_2.enums.YearOfFaculty;

public class App {
    public static void main(String[] args) {
        Person student1 = new Student("Mariusz Borek", "Bajeczna 55, 33-333 Kraków", Faculty.ARCHITECTURE, YearOfFaculty.FOURTH, 50_000) {
            @Override
            public String studying(String whatYouStudy) {
                System.out.print("Now I am studying: ");
                return super.studying(whatYouStudy);
            }

            @Override
            public String hobby(String hobby) {
                System.out.print("My hobby is: ");
                return super.hobby(hobby);
            }
        };
        Person student2 = new Student("Marcin Danel", "Błotna 23, 22-888 Katowice", Faculty.MECHANICAL_ENGINEERING, YearOfFaculty.THIRD, 25_000);

        Person lecturer1 = new Lecturer("Zofia Lebiedzik", "Główna 34, 56-848 Warszawa", Specialization.FINANCE_BANKING, 9_000);
        Person lecturer2 = new Lecturer("Andrzej Gołota", "Słaba 4, 12-454 Gdzańsk", Specialization.HEALTH_SERVICE, 12_000);


        System.out.println("---Student---");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println();
        System.out.println(student1.name);
        System.out.println(student1.address);
        System.out.println(((Student) student1).getCost());
        System.out.println(((Student) student1).getYearOfFaculty());
        System.out.println(((Student) student1).getFaculty());
        System.out.println(((Student) student1).studying("Math"));
        System.out.println(student1.hobby("Snowboard"));

        System.out.println("\n---Lecturer---");
        System.out.println(lecturer1.toString());
        System.out.println(lecturer2.toString());
        System.out.println();
        System.out.println(((Lecturer) lecturer1).getSpecialization());
        System.out.println(((Lecturer) lecturer1).getSalary());

        System.out.println("\n------------------------------");
        Person[] person = new Person[4];
        person[0] = new Student("Marcin Danel", "Błotna 23, 22-888 Katowice", Faculty.MECHANICAL_ENGINEERING, YearOfFaculty.THIRD, 25_000);
        person[1] = new Student("Mariusz Borek", "Bajeczna 55, 33-333 Kraków", Faculty.ARCHITECTURE, YearOfFaculty.FOURTH, 50_000);
        person[2] = new Lecturer("Andrzej Gołota", "Słaba 4, 12-454 Gdzańsk", Specialization.HEALTH_SERVICE, 12_000);
        person[3] = new Lecturer("Zofia Lebiedzik", "Główna 34, 56-848 Warszawa", Specialization.FINANCE_BANKING, 9_000);

        System.out.println("\n--wyswietlam pracowników i studentów za pomocą tablicy--");
        for (Person os : person) {
            System.out.println(os);
        }

        System.out.println("\n--wyswietlam tylko studentów za pomocą tablicy--");
        for (Person os : person) {
            if (os instanceof Student) {
                System.out.println(os);
            }
        }

        System.out.println("\nciekawostka -> typ sam się określa:");
        var var1 = 1;
        var var2 = 1.3f;
        var var3 = 'c';
        var var4 = "text";
        var var5 = true;
        System.out.println(var1 + ", " + var2 + ", " + var3 + ", " + var4 + ", " + var5);

    }
}
