package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {

    Teacher t1 = new Teacher("Anna", 37, "Lokförare", 35000);
    Teacher t2 = new Teacher("Simon", 0, "Säljare", 20000);
    Teacher t3 = new Teacher("Jocke", 30, "Scrum Lord", 0);


    // Checking if salaryCheck throws exception if salary is <= 0
    @Test
    public void salaryCheck1() throws MinusNumbersNotAllowedException {
        assertThrows(MinusNumbersNotAllowedException.class,() -> t3.salaryCheck(t3.getSalary()));
    }

    // Checking if salary is > 0
    @Test
    public void salaryCheck2() throws MinusNumbersNotAllowedException {
        assertDoesNotThrow(() -> t1.salaryCheck(t1.getSalary()));
    }

    // Checking if ageCheck throws exception if age is <= 0
    @Test
    public void ageCheck1() throws MinusNumbersNotAllowedException {
        assertThrows(MinusNumbersNotAllowedException.class,() -> t2.ageCheck(t2.getAge()));
    }

    // Checking that age is older than 0
    @Test
    public void ageCheck2() throws MinusNumbersNotAllowedException {
        assertDoesNotThrow(() -> t3.ageCheck(t3.getAge()));
    }
}