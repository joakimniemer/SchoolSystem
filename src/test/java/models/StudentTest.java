package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    Education e1 = new Education("Java Enterprise Utvecklare", 400, 2);
    Student student1 = new Student("Anders", 2000, 01, 01, e1);
    Student student2 = new Student("Bengt", 2007, 01, 01, e1);


    // Test doMathAddition succeeds with valid input
    @Test
    public void doMathAdditionTest() {
        try {
            assertEquals(4, student1.doMathAddition(2, 2));
        } catch (Exception e) {
            fail("Should not throw exception");
        }
    }

    // Test if doMathAddition throws exception when second number input is negative
    @Test
    public void doMathAdditionThrowsOne() throws MinusNumbersNotAllowedException {
        assertThrows(MinusNumbersNotAllowedException.class, () -> student1.doMathAddition(1, -1));
    }

    // Test if doMathAddition throws exception when first number input is negative
    @Test
    public void doMathAdditionThrowsTwo() throws MinusNumbersNotAllowedException {
        assertThrows(MinusNumbersNotAllowedException.class, () -> student1.doMathAddition(-1, 1));
    }

    // Test if doMathAddition throws exception when first both number input is negative
    @Test
    public void doMathAdditionThrowsThree() throws MinusNumbersNotAllowedException {
        assertThrows(MinusNumbersNotAllowedException.class, () -> student1.doMathAddition(-1, -1));
    }


    // Test if studentIsOfAge returns true when student is 18 years old or more
    @Test
    public void studentIsOfAgeTest() {
        assertTrue(student1.studentIsOfAge());
    }

    // Test if studentIsOfAge returns false when student is younger than 18 years
    @Test
    public void studentIsNotOfAgeTest() {
        assertFalse(student2.studentIsOfAge());
    }


    // Test if addBookToBackPack adds a book to the list of books (students backpack)
    @Test
    public void addBookToBackPackTest() {
        Book b1 = new Book("Book", "Author", 32);
        student1.addBookToBackPack(b1);
        assertEquals(1, student1.getBackpack().size());
    }
}
