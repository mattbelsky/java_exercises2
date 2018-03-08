package part_03;


import java.util.Random;
import java.util.Scanner;

/**

 Code a "Rock Paper Scissors" Game

 */
//class
public class Exercise_04 {

    //main method
    public static void main(String[] strings) throws java.io.IOException {

        //scanner to enter a number 0-2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");

        //create int variable "playerHand" that takes user input
        int playerHand = input.nextInt();

        //create int variable "computerHand" that generates a random number 0-2
        Random random = new Random();
        int computerHand = random.nextInt(2 - 0 + 1) + 0;

        //call the getHand method for the playerHand
        getHand(playerHand);

        //call the getHand method for the computerHand
        getHand(computerHand);

        //create an String variable "winner" by calling the determineWinner() method with parameters computerHand and playerHand
        String winner = determineWinner(computerHand, playerHand);

        //print out the player hand and computer hand
        System.out.println("Player hand: " + getHand(playerHand));
        System.out.println("Computer hand: " + getHand(computerHand));

        //print out the winner
        System.out.println(winner);


    }

    // getHand method
    public static String getHand(int hand){

        // create a switch statement to determine each players hand - return the String, ie "scissor" that goes with the int "hand"
        // 0 = scissor, 1 = rock, 2 = paper

        // Unreachable return statements within switch?
        String name = "";
        switch (hand) {
            case 0:
                name =  "scissors";
                break;
            case 1:
                name = "rock";
                break;
            case 2:
                name = "paper";
        }
        return name;
    }

    //determineWinner method returns a String such as "You won!" or "You lost :(" or "You tied!"
    public static String determineWinner(int computer, int player) {

        String status = "Idle";

        // determine if the game is a tie
        if (computer == player) {
            status = "You tied!";
        }
        else {

            // if it is not a tie, use a switch statement and a ternary operator to determine the winner
            /*  0 beats 2
                1 beats 0
                2 beats 1  */
            switch (player) {
                case 0:
                    status = (computer == 2) ? "You won!" : (computer == 1) ? "You lost" : "Idle";
                    break;
                case 1:
                    status = (computer == 0) ? "You won!" : (computer == 2) ? "You lost" : "Idle";
                    break;
                case 2:
                    status = (computer == 1) ? "You won!" : (computer == 0) ? "You lost" : "Idle";

            }
        }

        return status;
    }
}