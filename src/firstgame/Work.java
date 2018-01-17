/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgame;

import static firstgame.FirstGame.energy;
import static firstgame.FirstGame.job;
import static firstgame.FirstGame.jobEnergy;
import static firstgame.FirstGame.money;
import static firstgame.FirstGame.jobMoney;
/**
 *
 * @author rjjohnson
 */
public class Work {
    
    public static void Work(){
        System.out.println("\nWorking...");
        energy -= jobEnergy;
        money += jobMoney;
        System.out.println("\nEnergy: " + energy + "\nMoney: $" + money);
        FirstGame.promptEnterKey();
    }
}
