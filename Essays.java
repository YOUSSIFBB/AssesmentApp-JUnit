/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assesmentapp;

/**
 *
 * @author youssif
 */
public class Essays extends Quizzes { //this should extend Quizzes
    //vars 
    int wordCount;
    double essayResult;
    
    
    public Essays(String name, String moduleName, Double weighting, Double grade,int numQuestions, int wordCount){
        super(name, moduleName, weighting, grade, numQuestions); 
        this.wordCount = wordCount;
    
    }
    
    public Essays(){
        super(); 
        wordCount = 0;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }
    
    @Override
    public void computerGrade(){
        
        if(wordCount > 100){
            essayResult = (weighting * grade / 100) - 5; // deduct 5% if the wordCount is over 100
        }else if (wordCount < 100){
            essayResult = weighting * grade / 100;       // do not deduct if the essay word count is less than 100
        }
        
    }
/* 
    public double getEssayResult() {
        return essayResult;
    }
*/
    
    //the get details method shoudl be here, remember to overide the details since this is an extended file
    @Override
    public String getDetails(){
        return "Student details - Name : " + name + "\nModule Name : " + moduleName + "\nWeighting : " + weighting + "\nGrade : " + grade + "\nEssay Grade :" + essayResult;
    
    }
    
    
    
    
    
}
