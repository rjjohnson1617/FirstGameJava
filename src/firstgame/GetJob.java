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
import static firstgame.FirstGame.jobEnergy;

public class GetJob {
    
    Scanner scan = new Scanner(System.in);
    int choice, choice2, choice3;
    
    public void GetJob(){
        while(true){
            while(true){
                System.out.println("\nWhat job would you like to look at?");
                System.out.println("1. Janitor\n2. Line Cook\n3. Bartender"
                        + "\n4. Nevermind");
                choice = scan.nextInt();
                if(choice >= 1 && choice <= 4){
                    break;
                }
                FirstGame.showError();
                System.out.println("\nEnter a number 1 through 4.");
            }
            
            if(choice == 1){
                System.out.println("\nJanitor:\nPay: $10/Shift\nEnergy Consumption: "
                        + "-10/Shift");
                while(true){
                    System.out.println("\nDo you want to take this job?\n"
                            + "1. Yes\n2. No");
                    choice2 = scan.nextInt();
                    if(choice2 >=1 && choice2 <=2)
                        break;
                    FirstGame.showError();
                    System.out.println("\nPlease enter either '1' or '2'.");
                }
                if(choice2 == 1){
                    if(job != null){
                        while(true){
                            System.out.println("\nYou will need to quit your current job..."
                                    + "\nDo you want to quit your job as a " + job + "?"
                                            + "\n1. Yes\n2. No");
                            choice3 = scan.nextInt();
                            if(choice3 >=1 && choice3 <=2)
                                break;
                            FirstGame.showError();
                            System.out.println("\nPlease enter either '1' or '2'.");
                        }
                        if(choice3 == 1){
                            System.out.println("\nYou quit your job as a " + job + "!"
                                    + "\nCongrats! You were hired!");
                            job = "Janitor";
                            jobEnergy = 10;
                            GameWithJob gjob = new GameWithJob();
                            gjob.GameWithJob();
                            break;
                        }
                        else if(choice3 == 2){
                            System.out.println("\nYou chose to keep your job as a"
                                    + " " + job + "!");
                            GameWithJob gjob = new GameWithJob();
                            gjob.GameWithJob();
                            break;
                        }
                    }
                    System.out.println("\nCongrats! You were hired!");
                    job = "Janitor";
                    jobEnergy = 10;
                    GameWithJob gjob = new GameWithJob();
                    gjob.GameWithJob();
                    break;
                }
            }
            else if(choice == 2){
                System.out.println("\nLine Cook:\nPay: $10/Shift\nEnergy Consumption: "
                        + "-8/Shift");
                while(true){
                    System.out.println("\nDo you want to take this job?\n"
                            + "1. Yes\n2. No");
                    choice2 = scan.nextInt();
                    if(choice2 >=1 && choice2 <=2)
                        break;
                    FirstGame.showError();
                    System.out.println("\nPlease enter either '1' or '2'.");
                }
                if(choice2 == 1){
                    if(job != null){
                        while(true){
                            System.out.println("\nYou will need to quit your current job..."
                                    + "\nDo you want to quit your job as a " + job + "?"
                                            + "\n1. Yes\n2. No");
                            choice3 = scan.nextInt();
                            if(choice3 >=1 && choice3 <=2)
                                break;
                            FirstGame.showError();
                            System.out.println("\nPlease enter either '1' or '2'.");
                        }
                        if(choice3 == 1){
                            System.out.println("\nYou quit your job as a " + job + "!"
                                    + "\nCongrats! You were hired!");
                            job = "Line Cook";
                            jobEnergy = 8;
                            GameWithJob gjob = new GameWithJob();
                            gjob.GameWithJob();
                            break;
                        }
                        else if(choice3 == 2){
                            System.out.println("\nYou chose to keep your job as a"
                                    + " " + job + "!");
                            GameWithJob gjob = new GameWithJob();
                            gjob.GameWithJob();
                            break;
                        }
                    }
                    System.out.println("\nCongrats! You were hired!");
                    job = "Line Cook";
                    jobEnergy = 8;
                    GameWithJob gjob = new GameWithJob();
                    gjob.GameWithJob();
                    break;
                }
            }
            else if(choice == 3){
                System.out.println("\nBartender:\nPay: $12/Shift\nEnergy Consumption: "
                        + "-10/Shift");
                while(true){
                    System.out.println("\nDo you want to take this job?\n"
                            + "1. Yes\n2. No");
                    choice2 = scan.nextInt();
                    if(choice2 >=1 && choice2 <=2)
                        break;
                    FirstGame.showError();
                    System.out.println("\nPlease enter either '1' or '2'.");
                }
                if(choice2 == 1){
                    if(job != null){
                        while(true){
                            System.out.println("\nYou will need to quit your current job..."
                                    + "\nDo you want to quit your job as a " + job + "?"
                                            + "\n1. Yes\n2. No");
                            choice3 = scan.nextInt();
                            if(choice3 >=1 && choice3 <=2)
                                break;
                            FirstGame.showError();
                            System.out.println("\nPlease enter either '1' or '2'.");
                        }
                        if(choice3 == 1){
                            System.out.println("\nYou quit your job as a " + job + "!"
                                    + "\nCongrats! You were hired!");
                            job = "Bartender";
                            jobEnergy = 10;
                            GameWithJob gjob = new GameWithJob();
                            gjob.GameWithJob();
                            break;
                        }
                        else if(choice3 == 2){
                            System.out.println("\nYou chose to keep your job as a"
                                    + " " + job + "!");
                            GameWithJob gjob = new GameWithJob();
                            gjob.GameWithJob();
                            break;
                        }
                    }
                    System.out.println("\nCongrats! You were hired!");
                    job = "Bartender";
                    jobEnergy = 10;
                    GameWithJob gjob = new GameWithJob();
                    gjob.GameWithJob();
                    break;
                }
            }
            else{
                break;
            }
        }
    }
}
