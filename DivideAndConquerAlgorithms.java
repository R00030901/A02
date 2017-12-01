
/**
 * Class: ChangeMaking
 * This class implements a greedy algorithm for solving the change making problem.
 */

public class ChangeMaking {
	/**
	 * Method: testChangeMaking
	 * 
	 * Tests and compares the algorithm for making change.
	 */
	public static void testChangeMaking()
	{
	
			int[] denoms = new int[4];

			// possible changes of coins 
			denoms[0]=20; // coin of value 20
			denoms[1]=10; // coin of value 10
			denoms[2]=5;  // coin of value 5
			denoms[3]=1;  // coin of value 1
	
			int val1 = 0; // maximum amount of money
			int val2 = 35; // maximum amount of money
			int val3 = 53; // maximum amount of money
			
		    System.out.println("\n(Greedy solution) Number of coins needed: " + makeChangeGreedy(denoms, val1));
			System.out.println("\n(Greedy solution) Number of coins needed: " + makeChangeGreedy(denoms, val2));
			System.out.println("\n(Greedy solution) Number of coins needed: " + makeChangeGreedy(denoms, val3));

	
	}

	/**
	 * Method: makeChangeGreedy
	 * 
	 * Implements the greedy algorithm for solving
	 * the change making problem.
	 * 
	 * @param denoms array containing the different denominations
	 * @param val the target sum
	 * @return the number of coins needed
	 */
	public static int makeChangeGreedy(int[] denoms, int val)
	{
		// Declare variables
		int total = 0;
		int value = val;
		int coinCount = 0;
		// scenario identification
		int scenario = 0;
		
		// rule 1 no items in array
		if (denoms.length == 0) {
			scenario = 1;
		}
		// rule 2 no value to total up to
		else if (value == 0) {
			scenario = 2;
		}
		// rule 3 base statement
		else if (total == value) {
			scenario = 3;
		}
		// rule 4 if the code over added to total
		else if (total > value) {
			scenario = 4;
		}
		// rule 5 main operational code: expected input
		else if (total < value) {
			scenario = 5;
			/* method depends on the list being ordered largest to smallest and returns the minimum number of coins 
			 * required to get to total
			 */
		}
		else {
			System.out.println("Could not evaluate array, please check array and try again.");
		}
		
		// the cases
		switch(scenario) {
		case 1:
			System.out.println("There are no items to add");
			
			break;
			
		case 2:
			System.out.println("No Computation is needed");
			
			break;
			
		case 3:
			System.out.println("Operation Finished");
			
			break;
			
		case 4:
			System.out.println("The operation returned an invalid answer");
			
			break;
			
		case 5:
			//block comment code & uncomment print to check of the switch statement is working
			//System.out.println("we got to case 5");
			//coinCount++;
			
			while (total < value) {
				for (int i = 0; i < denoms.length; i++) {
					

						for (int j = 0; j < denoms.length; j++) {
							if (total + denoms[i] <= value) {
							total = total + denoms[i];
							coinCount++;
							//System.out.println("total " + total + " : value " + denoms[i]);
							/*uncomment print statement to see the total being added up and what order the 
							 * values are being added in 
							 */
						}
					}
				} 
			}
			return coinCount;
		}
		return coinCount;
	}

	/**
	 * Main.
	 */
	public static void main(String[] args)
	{
		testChangeMaking();
	}
}
