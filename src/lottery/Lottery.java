package lottery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> winningNumbers = new ArrayList<>();

		// Create random numbers for now
		Random random = new Random();

		// Run for loop 6 times to generate 6 numbers for winningNumbers
		// Make sure no repeated
		for (int i = 0; i < 6; i++) {
			while (true) {
				int winningNumber = random.nextInt(49) + 1;
				if (!winningNumbers.contains(winningNumber)) {
				winningNumbers.add(winningNumber);
				break;
			}
		}
		}
		Collections.sort(winningNumbers);
		System.out.println("Winning Numbers: " + winningNumbers);
		System.out.println("");

		// Request Input from User
		System.out.println("==========================");
		System.out.println("Welcome to the Lottery App");
		System.out.println("==========================\n");

		System.out.println("Select 6 Numbers from 1 to 49\n");

		// Import Scanner for User Input
		Scanner sc = new Scanner(System.in);

		// ArrayList for guessedNumbers
		List<Integer> guessedNumbers = new ArrayList<>();

		// A For loop for scanner sc
		for (int i = 0; i < 6; i++) {
			System.out.println("Your current numbers are: " + guessedNumbers);
			System.out.println("Enter a Number [1-49]");
			while (true) {
				try {
					String numbersString = sc.nextLine();
					int number = Integer.parseInt(numbersString);
					if (number >= 1 && number <= 49) {
						guessedNumbers.add(number);
						 //using Collections.sort() to sort ArrayList
				        Collections.sort(guessedNumbers);
						System.out.println("Your 6 numbers are: " + guessedNumbers);
						break;
					} else {
						System.out.println("Pick a number between 1 and 49 !");
					}
				} catch (NumberFormatException nfe) {
					System.out.println("Not a Number!");
				}
			}
		}
		System.out.println("Winning Numbers are: " + winningNumbers);
		System.out.println("");
		System.out.println("Your Numbers are: " + guessedNumbers);
		
		guessedNumbers.retainAll(winningNumbers);
		
		System.out.println("matched Numbers are: " + guessedNumbers);
		
		if (guessedNumbers.containsAll(winningNumbers)) {
			System.out.println("WOW!  You guessed all 6! \n !!! YOU JUST WON THE LOTTERY !!!");
		}
		else {
			System.out.println("Unlucky. You didn't get ALL 6 - Try again.");
		}
	}
}
