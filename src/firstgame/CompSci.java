/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgame;

import java.util.Scanner;
import java.text.DecimalFormat;
import static firstgame.FirstGame.major;
/**
 *
 * @author rjjohnson
 */
public class CompSci {
    
    Scanner scan = new Scanner(System.in);
    double numCorrect, numWrong, totalQuestions;
    char examChoice;
    String finalScore;
    double score;
    
    public void CompSci(){
        
    }
    
    public void calcScore(){
        DecimalFormat df = new DecimalFormat("#%");
        score = numCorrect/totalQuestions;
        finalScore = df.format(score);
    }
    
    public void CompSciEntrance(){
        System.out.println("\nYou must pass the entrance exam.\nEnter the "
                        + "letter of your answer.");
        totalQuestions = 5;
        System.out.println("\n1. Which of the following is a programming language?"
                + "\n\tA) Delta\n\tB) Ptarro\n\tC) Java");
        examChoice = scan.next().charAt(0);
        if(examChoice == 'C' || examChoice == 'c'){
            System.out.println("\nCORRECT!");
            numCorrect += 1;
        }
        else{
            System.out.println("\nIncorrect. The correct answer was 'C'");
            numWrong += 1;
        }
        
        FirstGame.promptEnterKey();
        
        System.out.println("\n2. In Internet terminology, what does IP stand for?"
                + "\n\tA) Internet Protocol\n\tB) Interested Party\n\t"
                + "C) Illegal Protocol");
        examChoice = scan.next().charAt(0);
        if(examChoice == 'A' || examChoice == 'a'){
            System.out.println("\nCORRECT!");
            numCorrect += 1;
        }
        else{
            System.out.println("\nIncorrect. The correct answer was 'A'");
            numWrong += 1;
        }
        
        FirstGame.promptEnterKey();
        
        System.out.println("\n3. The standard protocol of the Internet is:"
                + "\n\tA) MTP\n\tB) IMAP3\n\tC) TCP/IP");
        examChoice = scan.next().charAt(0);
        if(examChoice == 'C' || examChoice == 'c'){
            System.out.println("\nCORRECT!");
            numCorrect += 1;
        }
        else{
            System.out.println("\nIncorrect. The correct answer was 'C'");
            numWrong += 1;
        }
        
        FirstGame.promptEnterKey();
        
        System.out.println("\n4. The basic architecture of computer was developed by:"
                + "\n\tA) John Von Neumann\n\tB) Charles Babbage\n\t"
                + "C) Blaise Pascal\n\tD) Garden Moore");
        examChoice = scan.next().charAt(0);
        if(examChoice == 'A' || examChoice == 'a'){
            System.out.println("\nCORRECT!");
            numCorrect += 1;
        }
        else{
            System.out.println("\nIncorrect. The correct answer was 'A'");
            numWrong += 1;
        }
        
        FirstGame.promptEnterKey();
        
        System.out.println("What is another term for Main Memory?\n\t"
                + "A) Hard Disk\n\tB) ROM\n\tC) Floppy Disk\n\tD) RAM");
        examChoice = scan.next().charAt(0);
        if(examChoice == 'D' || examChoice == 'd'){
            System.out.println("\nCORRECT!");
            numCorrect += 1;
        }
        else{
            System.out.println("\nIncorrect. The correct answer was 'D'");
            numWrong += 1;
        }
        
        calcScore();
        if(score >= 0.5){
            System.out.println("\nCongrats you passed!\nScore: " + finalScore);
            System.out.println("You are now enrolled in the Computer Science program!");
            major = "Computer Science";
        }
        else{
            System.out.println("\nYou failed... You needed at least a 50%\nScore: " + finalScore);
        }
    }
}
