package pl.kurs;

import pl.kurs.builder.Course;
import pl.kurs.builder.Student;
import pl.kurs.lombok.Employee;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //https://nullpointerexception.pl/lombok-dobre-i-slabe-strony/

        // https://devcave.pl/effective-java/wzorzec-projektowy-builder

        Employee e1 = new Employee("Jan", "Kowalski", 3300, "234123423");
        System.out.println(e1);

        Student s1 = new Student("jan", "kowalski");
        Student s2 = new Student("jan2", "kowalski2");
        Student s3 = new Student("jan3", "kowalski3");

        Course c1 = Course.builder()
                .name("java course")
                .location("online")
                .studentList(s1)
                .studentList(s2)
                .studentList(s3)
                .build();

        System.out.println(c1);

        /*
         * Stworz klase Piwo (marka, cena, jakosc piany, lista skladnikow, opcjonalna zawartosc alkoholu)
         * Stworz klase Alkoholik (imie, nazwisko, lista piw (asocjacja)).
         *
         * Piwo ma wyswietlac tylko marke i cene.
         *
         * Alkoholik ma wyswietlac tylko imie i nazwisko
         *
         * W piwie marka ma byc polem niemodyfikowalnym
         *
         * Dwa piwa sa takie same jesli marka i cena jest taka sama
         *
         * Uzyj buildera do tworzenia obiektow + powiazan
         */
    }
}
