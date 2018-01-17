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
public class FirstGame {

    /**
     * @param args the command line arguments
     */
    
    //Displays red prompt, waiting for enter key to be pressed
    //Running in CMD doesn't display red text, but '[31m'...
    public static void promptEnterKey(){
        System.out.println((char)27 + "[31m\nPress ENTER to continue..." + (char)27 + "[0m");
        Scanner scan2 = new Scanner(System.in);
        scan2.nextLine();
    }
    
    //Displays red error message
    public static void showError(){
        System.out.println((char)27 + "[31m\nERROR!!\033" + "[0m");
    }
    
    //global variables
    static String name;
    static int age;
    static int money;
    static int day;
    static int energy = 100;
    static String job;
    static int jobEnergy;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int choice;
        
        System.out.println("Welcome to the Game of Life!");
        while(true){
            System.out.println("\nWould you like to run the tutorial?\n1. Yes\n2. No");
            choice = scan.nextInt();
            if(choice >= 1 && choice <= 2){
                break;
            }
            showError();
            System.out.println("\nEnter either '1' or '2'");
        }
        
        if(choice == 1){
            //run tutorial
            Tutorial tut = new Tutorial();
            tut.Tutorial();
            
            System.out.println("\nFor completing the tutorial, we've awarded "
                    + "you an extra $2000!");
            money += 2000;
            System.out.println("\nLet's begin your life!!");
            promptEnterKey();
            LifeStart ls = new LifeStart();
            ls.LifeStart();
        }
        else if(choice == 2){
            //no tutorial
            System.out.println("\nWe have added $5000 to your wallet to get you started!");
            money += 5000;
            promptEnterKey();
            
            //Consume newline left over
            scan.nextLine();
            
            System.out.println("Please enter your name: ");
            name = scan.nextLine();
            
            while(name.isEmpty()){
                showError();
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
            
                showError();
                System.out.println("\nAge must be between 0 and 100.");
                System.out.println("Please enter your age: ");
            }
            
            System.out.println("\nLet's begin your life!!");
            promptEnterKey();
            LifeStart ls = new LifeStart();
            ls.LifeStart();
        }
    }
    
}
