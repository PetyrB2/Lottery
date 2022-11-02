package lottery;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> winningNumbers = new ArrayList<>();
		
		// Create random numbers for now
		Random random = new Random();
		
		// Run for loop 6 times to generate 6 numbers for winningNumbers
		// Make sure no repeated
		for (int i = 0; i < 6; i++) {
			while(true) {
			int winningNumber = random.nextInt(49) + 1;
			if (!winningNumbers.contains(winningNumber));
			winningNumbers.add(winningNumber);
			break;
			}
		}
		System.out.println(winningNumbers);
	}	
}
