/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgame;

import static firstgame.FirstGame.major;
import java.util.Scanner;

/**
 *
 * @author rjjohnson
 */
public class GameWithJob {
    
    Scanner scan = new Scanner(System.in);
    int choice;
    
    public void GameWithJob(){
        while(true){
            if(major != null){
                GameWithJobMajor gjm = new GameWithJobMajor();
                gjm.GameWithJobMajor();
                break;
            }
            while(true){
                System.out.println("\nWhat would you like to do?\n1. Work\n2. Enroll"
                        + " in College\n3. ...");
                choice = scan.nextInt();
                if(choice >= 1 && choice <= 3){
                    break;
                }
                FirstGame.showError();
                System.out.println("\nEnter a number ...");
            }
            if(choice == 1){
                Work w = new Work();
                w.Work();
            }
            else if(choice == 2){
                EnrollCollege ec = new EnrollCollege();
                ec.EnrollCollege();
            }
        }
    }
}
