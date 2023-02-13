package models;

import java.util.ArrayList;
import java.util.List;

public class Education {

    private String programName;
    private int programPoints;
    private int programTimeInYears;

    public Education (String programName, int programPoints, int ProgramTimeInYears){
        this.programName= programName;
        this.programPoints = programPoints;
        this.programTimeInYears= ProgramTimeInYears;
    }

    public boolean equals(Object obj){
        boolean status = false;
        if(this.programName.equalsIgnoreCase(programName)
                && this.programPoints == programPoints
                && this.programTimeInYears== programTimeInYears){
            status = true;
        }
        return status;
    }

    public static List<models.Education> getEducationList(){
        List<models.Education> program = new ArrayList<models.Education>();
        program.add(new models.Education("JavaProgram", 150, 3));
        program.add(new models.Education("JavaProgram", 150, 3));
        program.add(new models.Education("PythonProgram", 200, 4));
        program.add(new models.Education("PythonProgram", 200, 4));
        return program;
    }

    public String getProgramName() {
        return programName;
    }
    public void setProgramName(String programName) {
        this.programName = programName;
    }
    public int getProgramPoints() {
        return programPoints;
    }
    public void setProgramPoints(int programPoints) {
        this.programPoints = programPoints;
    }
    public int getProgramTimeInYears() {
        return programTimeInYears;
    }
    public void setProgramTimeInYears(int programTimeInYears) {
        this.programTimeInYears = programTimeInYears;
    }

    @Override
    public String toString(){
        return String.format("%s, %d points and last for %d years", programName, programPoints, programTimeInYears);
    }
}