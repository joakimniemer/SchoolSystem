package ui;

import models.Book;
import models.Education;
import models.Student;
import models.Teacher;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Hampus Gam", 52, "Balettinstruktör", 20000);

        Book b1 = new Book("Java: A Beginner's Guide, Eighth Edition", "Herbert Schildt", 720);

        Education e1 = new Education("Java Enterprise Utvecklare", 400, 2);

        Student s1 = new Student("Joakim", 1992, 9, 14, e1);

        System.out.println(s1);

        System.out.println(t1);

        System.out.println(b1.giveWisdom());

        System.out.println(e1);
    }
}
