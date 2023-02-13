package models;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {

    private String name;
    private LocalDate dateOfBirth;
//    private Program program;
//    private List<Book> backpack;


    public Student(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.name = name;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
//        this.program = program;
//        this.backpack = new ArrayList<>();
    }


    // Method with two numbers(int) as input that returns the sum of the two numbers.
    public int doMathAddition(int number1, int number2) throws MinusNumbersNotAllowedException {
        if (number1 <= 0 || number2 <= 0) {
            throw new MinusNumbersNotAllowedException();
        }
        return number1 + number2;
    }


    // Method for checking if student is of age (18 years old or more)
    public boolean studentIsOfAge() {
        LocalDate today = LocalDate.now();
        if (today.minusYears(18).compareTo(dateOfBirth) >= 0) {
            return true;
        }
        return false;
    }


    // Method for adding books to students backpack.
    public void addBookToBackPack() {
//        Book book = new Book();
//        backpack.add(book);
    }


    public String getName() {
        return name;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    @Override
    public String toString() {
        return String.format("%s is born %s and is attending program .... At the moment he is reading .....", name, dateOfBirth.toString());
    }
}
