/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assesmentapp;
import javax.swing.JOptionPane;

/**
 *
 * @author youssif
 */
public class AssesmentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //main class var 
        int assesmentType;
        
        // ask the user for the type of the test
        JOptionPane.showMessageDialog(null, "Hellow and welcome the the Assesment App");
        assesmentType = Integer.parseInt(JOptionPane.showInputDialog(null, "Eneter assesment type" + "\n1. for Quizzes " + "\n2. for Essays"));
        
        
        
        //Quizz methods and getters here
        if(assesmentType == 1){
            String name = JOptionPane.showInputDialog(null, "Enter your name");
            String moduleName = JOptionPane.showInputDialog(null, "Enter Module Name");
            double weighting = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter weighting for the Quizz"));
            double grade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter grade for the Quizz out of 100"));
            int numQuestions = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of questions"));
            Quizzes q = new Quizzes (name,moduleName,weighting ,grade, numQuestions);  //acting as the setters here overloaded constructer
            
            q.computerGrade();
            
            JOptionPane.showMessageDialog(null, q.getDetails());
            
        }else if (assesmentType == 2){
            String name = JOptionPane.showInputDialog(null, "Enter your name");
            String moduleName = JOptionPane.showInputDialog(null, "Enter Module Name");
            double weighting = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter weighting for the Quizz"));
            double grade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter grade for the essay out of 100"));
            int wordCount = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter word count"));
            int numQuestions = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of questions"));
            Essays e = new Essays (name, moduleName ,weighting ,grade, numQuestions, wordCount); //overloaded constructor
            
            e.computerGrade();
            
            JOptionPane.showMessageDialog(null, e.getDetails()); //print details to the user
            
 
        }else{
            JOptionPane.showMessageDialog(null, "Invalid selection");
        }
       
    }
    
}
