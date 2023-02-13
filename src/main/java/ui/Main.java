package ui;

import models.Book;
import models.Student;
import models.Teacher;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Joakim", 1992, 9, 14);

        Teacher t1 = new Teacher("Hampus Gam", 52, "Balettinstruktör", 20000);

        Book b1 = new Book("Java: A Beginner's Guide, Eighth Edition", "Herbert Schildt", 720);

        System.out.println(s1);

        System.out.println(t1);

        System.out.println(b1.giveWisdom());



    }
}
