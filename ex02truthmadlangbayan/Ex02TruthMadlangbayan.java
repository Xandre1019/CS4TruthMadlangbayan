/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02truthmadlangbayan;

import java.util.Scanner;

/**
 *
 * @author TRUTH
 */
public class Ex02TruthMadlangbayan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Welcome to Higher or Lower! What will you do? \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("-Start game\n" + "-Change settings\n" + "-End application\n");
        String option = sc.nextLine();
        System.out.printf("You have chosen %s" + "\n", option); //Selection done
        
        //Start game as is
        String answer;
        int random = (int) Math.floor(Math.random()*10) + 1;
        System.out.print(random + "\n");
        
        for (int guesses=3; guesses>0; guesses--) { //for loop for guesses
            
            System.out.print("You have " + guesses + " guess(es) left. What is your guess? ");
            int guess = Integer.parseInt(sc.nextLine());
            
            if (guesses > 0 && guess != random) {
                System.out.print("You have " + guesses + " guess(es) left. What is your guess? ");
                }

            if (guesses == 0) {
                System.out.print("You lost..."  + "\n");
                }

            else if (guesses > 0 && guess == random) {
                System.out.print("You got it!" + "\n");
                }
            }

            /**do { //yes or no answer loop
                System.out.print("Play again (y/n)? ");
                String y_or_n = sc.nextLine();
                answer = y_or_n;
                } while (!"n".equals(answer));**/
    }
    
}
