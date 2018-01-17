/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgame;
import java.util.Scanner;
/**
 *
 * @author rjjohnson
 */

import static firstgame.FirstGame.money;
import static firstgame.FirstGame.name;
import static firstgame.FirstGame.age;
import static firstgame.FirstGame.day;
import static firstgame.FirstGame.energy;
import static firstgame.FirstGame.job;

public class LifeStart {
    
    Scanner scan = new Scanner(System.in);
    int choice;
    
    public void LifeStart(){
        while(true){
            System.out.println("\nHi " + name + "!");
            while(true){
                System.out.println("\nWhat would you like to do?\n1. Get A Job"
                        + "\n2. Enroll in College\n3. ...");
                choice = scan.nextInt();
                if(choice >= 1 && choice <= 3){
                    break;
                }
                FirstGame.showError();
                System.out.println("\nEnter a number 1 through ...");
            }
        
            if(choice == 1){
                GetJob gj = new GetJob();
                gj.GetJob();
                if(job != null)
                    break;
            }
            else if(choice == 2){
                EnrollCollege ec = new EnrollCollege();
                ec.EnrollCollege();
                GameWithMajor gm = new GameWithMajor();
                gm.GameWithMajor();
            }
        }
    }
}
