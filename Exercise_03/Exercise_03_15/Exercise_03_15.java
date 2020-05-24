/*
(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a threedigit
number. The program prompts the user to enter a three-digit number and
determines whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is
$10,000.
2. If all digits in the user input match all digits in the lottery number, the award is
$3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is
$1,000.
*/
import java.util.Scanner;

public class Exercise_03_15 {
	public static void main(String[] args) {
        // Generate a lottery number
        int lottery = (int) (Math.random() * 1000);
        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (Three digits): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int Ld1 = lottery / 100;
        int Ld2 = (lottery / 10) % 10;
        int Ld3 = lottery % 10;

        // Get digits from guess
        int Gd1 = guess / 100;
        int Gd2 = (guess / 10) % 10;
        int Gd3 = guess % 10;
        
        
        System.out.println("The lottery number is " + lottery);

        boolean allD = (Gd1 == Ld1 || Gd1 == Ld2 || Gd1 == Ld3) && (Gd2 == Ld1 || Gd2 == Ld2 || Gd2 == Ld3) && (Gd3 == Ld1 || Gd3 == Ld2 || Gd3 == Ld3);
        boolean oneD = (Gd1 == Ld1 || Gd1 == Ld2 || Gd1 == Ld3) || (Gd2 == Ld1 || Gd2 == Ld2 || Gd2 == Ld3) || (Gd3 == Ld1 || Gd3 == Ld2 || Gd3 == Ld3);
       
        // Check the guess
        if (guess == lottery) {
            System.out.println("Exact match: you win $12,000");
        } else if (allD) {
            System.out.println("Match all digits: you win $5,000");
        } else if (oneD) {
            System.out.println("Match one digit: you win $2,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
