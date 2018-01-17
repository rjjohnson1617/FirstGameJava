/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgame;

import java.util.Scanner;
import static firstgame.FirstGame.money;
import static firstgame.FirstGame.name;
import static firstgame.FirstGame.age;
import static firstgame.FirstGame.day;
import static firstgame.FirstGame.job;

/**
 *
 * @author rjjohnson
 */
public class Tutorial {
    
    public void Tutorial(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nWelcome to the tutorial!");
        System.out.println("We have added $5000 to your wallet to get you started!");
        money += 5000;
        FirstGame.promptEnterKey();
        
        System.out.println("Please enter your name: ");
        name = scan.nextLine();
        while(name.isEmpty()){
            FirstGame.showError();
            System.out.println("\nPlease enter your name: ");
            name = scan.nextLine();
        }
        
        System.out.println("\nPlease enter your age: ");
        while(true){
            String input = scan.nextLine();
            try{
                age = Integer.parseInt(input);
                if(age > 0 && age < 100)
                    break;
            } catch (NumberFormatException e){}
            
            FirstGame.showError();
            System.out.println("\nAge must be between 0 and 100.");
            System.out.println("Please enter your age: ");
        }
        
        System.out.println("\nHello " + name + ". Let's explain how the game works!");
        System.out.println("Every day consists of 24 hours in which you can choose what you do.");
        System.out.println("Each year consists of 365 days, at the end of which your age will increase.");
        FirstGame.promptEnterKey();
        System.out.println("Managing your time will be key to surviving.");
        System.out.println("Every action you perform will consume some energy.");
        System.out.println("When your energy reaches 0, you must sleep to recharge.");
        FirstGame.promptEnterKey();
        System.out.println("You must also maintain your happiness.");
        System.out.println("If your happiness level drops below 25, you will enter a depressed state.");
        System.out.println("In the depressed state, you will have less energy to do things each day until your happiness increases.");
        FirstGame.promptEnterKey();
        System.out.println("You can use money to buy objects to increase the value of your life.");
        System.out.println("Money will be earned by working at a job.");
        System.out.println("Better jobs can be obtained by learning new skills.");
        FirstGame.promptEnterKey();
        System.out.println("To recap, the key stats you need to monitor and maintain are: ");
        System.out.println("ENERGY");
        System.out.println("HAPPINESS");
        System.out.println("MONEY");
        FirstGame.promptEnterKey();
        System.out.println("Of course, there are other stats you can monitor, but they are not necessary to survival.");
        System.out.println("Let's begin your life!!");
    }
    
}
