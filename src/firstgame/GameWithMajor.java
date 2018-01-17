/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgame;

import java.util.Scanner;
import static firstgame.FirstGame.job;
/**
 *
 * @author rjjohnson
 */
public class GameWithMajor {
    
    Scanner scan = new Scanner(System.in);
    int choice;
    
    public void GameWithMajor(){
        while(true){
            if(job != null){
                GameWithJobMajor gjm = new GameWithJobMajor();
                gjm.GameWithJobMajor();
                break;
            }
            while(true){
                System.out.println("\nWhat would you like to do?\n1. Get A Job"
                        + "\n2. Go To College\n3. ...");
                choice = scan.nextInt();
                if(choice >= 1 && choice <= 3){
                    break;
                }
                FirstGame.showError();
                System.out.println("\nEnter a number 1 through ...");
            }
        }
    }
}
