package models;


import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class EducationTest {

    Object[] expectedEducation = new Object[4];

    @Before
    public void initInputs(){
        expectedEducation [0] = new Education ("JavaProgram", 150, 3);
        expectedEducation[1] = new Education ("JavaProgram", 150, 3);
        expectedEducation [2] = new Education ("PythonProgram", 200, 4);
        expectedEducation [3] = new Education ("PythonProgram", 200, 4);
    }

    @Test
    public void compareEducation (){
        Education TestClass = new Education ("JavaProgram", 150, 3);
        assertEquals("JavaProgram", TestClass.getProgramName());
    }
}