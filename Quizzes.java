/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assesmentapp;

/**
 *
 * @author youssif
 */
public class Quizzes {
    
    //vars
    protected String name, moduleName;          //name is the students name
    protected Double weighting, grade, result;   //grade is the acheived grade // add result for the compute method
    protected int numQuestions;
    
    public Quizzes(String name, String moduleName, Double weighting, Double grade, int numQuestions){
        this.name = name; 
        this.moduleName = moduleName;
        this.weighting = weighting; 
        this.grade = grade;
        this.numQuestions = numQuestions;
    
    }
    
    public Quizzes(){
        name = " ";
        moduleName = " ";
        weighting = 0.0; 
        grade = 0.0;
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Double getWeighting() {
        return weighting;
    }

    public void setWeighting(Double weighting) {
        this.weighting = weighting;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }
    
    //compute grade here
    public void computerGrade(){
        result = weighting * grade / 100;
    }

    public Double getResult() {
        return result;
    }
    
    
    
    
    public String getDetails(){
        return "Student details - Name : " + name + "\nModule Name : " + moduleName + "\nWeighting : " + weighting + "\nGrade : " + grade + "\nNumber of questions :" + numQuestions + "\nYour overall result is : %" + result;
    }
    
    
    
    
}
