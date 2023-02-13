package models;

public class Teacher {
    private String name;
    private int age;
    private String program;
    private double salary;

    public Teacher(String name, int age, String program, double salary) {
        this.name = name;
        this.age = age;
        this.program = program;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format(name + " is " + age + "and the teacher of " + program + " and has a salary of " + salary);
    }

    public double salaryCheck(double salary) throws MinusNumbersNotAllowedException {
      if (salary <= 0) {
        throw new MinusNumbersNotAllowedException();
      }
        return salary;
    }

    public int ageCheck(int age) throws  MinusNumbersNotAllowedException {
        if (age <= 0) {
            throw new MinusNumbersNotAllowedException();
        }
        return age;
    }

    public String getName() {
        return name;
    }

    public int getAge() { return age; }

    public String getProgram() {
        return program;
    }

    public double getSalary() {
        return salary;
    }
}
