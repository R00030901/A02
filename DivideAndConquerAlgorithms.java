
/**
 * The class contains the Divide and Conquer-based Algorithms we are using. 
 */
public class DivideAndConquerAlgorithms {

	//----------------------------------------------
	// Class constructor
	//----------------------------------------------	
	/**
	 * Constructor of the class. Do not edit it.
	 */
	public DivideAndConquerAlgorithms(){}

	//-------------------------------------------------------------------
	// 0. iterativeDisplayElements --> Displays all elements of a MyDynamicList 
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyDynamicList, this iterative algorithm displays its elements by screen (if any).
	 * @param m: The MyDynamicList we want to display its elements.	  
	 */	
	public void iterativeDisplayElements(MyDynamicList m){
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 

		//Rule 1. MyDynamicList is empty
		if (m.length() == 0) 
			scenario = 1;
		//Rule 2. MyDynamicList is non-empty
		else
			scenario = 2;

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	

		//Rule 1. MyDynamicList is empty
		case 1: 
			//1. We print the empty message
			System.out.println("Empty MyDynamicList");

			break;

			//Rule 2. MyDynamicList is non-empty
		case 2: 
			//1. We print the initial message
			int size = m.length();
			System.out.println("MyDynamicList Contains the following " + size + " items: ");

			//2. We traverse the items
			for (int i = 0; i < size; i++)
				System.out.println("Item " + i + ": " + m.getElement(i));

			break;

		}

	}

	//-------------------------------------------------------------------
	// 1. maxInt --> Computes the maximum item of MyDynamicList 
	//-------------------------------------------------------------------	
	/**
	 * The function computes the maximum item of m (-1 if m is empty). 
	 * @param m: The MyDynamicList we want to compute its maximum item.
	 * @return: The maximum item of MyDynamicList	  
	 */	
	public int maxInt(MyDynamicList m){
		if (m.length() >= 0) {
			int temp = ???;
		}
		return 0;
	}

	//-------------------------------------------------------------------
	// 2. isReverse --> Computes if MyDynamicList is sorted in decreasing order 
	//-------------------------------------------------------------------	
	/**
	 * The function computes whether m is sorted in decreasing order or not.  
	 * @param m: The MyDynamicList we want to check.
	 * @return: Whether m is sorted in decreasing order or not.  
	 */	
	public boolean isReverse(MyDynamicList m){
			
	}

	//-------------------------------------------------------------------
	// 3. getNumAppearances --> Computes the amount of times that integer appears in MyDynamicList  
	//-------------------------------------------------------------------	
	/**
	 * The function computes the amount of times that the integer n appears in m.   
	 * @param m: The MyDynamicList we want to use.
	 * @param n: The number we want to compute its appearances for.
	 * @return: The amount of appearances of n into m  
	 */	
	public int getNumAppearances(MyDynamicList m, int n){
		
	}

	//-------------------------------------------------------------------
	// 4. power --> Computes the m-est power of n
	//-------------------------------------------------------------------	
	/**
	 * The function computes n to the power of m.
	 * @param n: The base number.
	 * @param m: The power of n we want to compute
	 * @return: n to the power of m.  
	 */	

	public int power(int n, int m){
			
	}

	//-------------------------------------------------------------------
	// 5. lucas --> Computes the n-est term of the Lucas series
	//-------------------------------------------------------------------	
	/**
	 * The function computes the n-est term of the Lucas series
	 * @param n: The n-est term of the series we want to compute
	 * @return: The term being computed 
	 */	
	public int lucas(int n){
			
	}

	//-------------------------------------------------------------------
	// 6. drawImage --> Prints a pattern of a given length
	//-------------------------------------------------------------------	
	/**
	 * The function prints prints a pattern of a given length.
	 * *
	 * **
	 * ***
	 * ... 
	 * @param n: The length of the desired pattern
	 */	
	public void drawImage(int n){
		
	}

	//-------------------------------------------------------------------
	// 7. drawLine --> Prints a line of a given length
	//-------------------------------------------------------------------	
	public void drawLine(int n){
			

	}

}

