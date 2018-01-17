/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgame;

import java.util.Scanner;
import static firstgame.FirstGame.major;
/**
 *
 * @author rjjohnson
 */
public class EnrollCollege {
    
    Scanner scan = new Scanner(System.in);
    int choice;
    int numCorrect, numWrong;
    double percent;
    char examChoice;
    
    public void EnrollCollege(){
        while(true){
            while(true){
                System.out.println("\nWhat would you like to major in?");
                System.out.println("1. Computer Science\n2. Engineering"
                        + "\n3. Mathematics\n4. Nevermind");
                choice = scan.nextInt();
                if(choice >= 1 && choice <= 4){
                    break;
                }
                FirstGame.showError();
                System.out.println("\nEnter a number 1 through 4.");
            }
            if(choice == 1){
                CompSci cs = new CompSci();
                cs.CompSciEntrance();
                if(major != null){
                    break;
                }
            }
        }
    }
}
