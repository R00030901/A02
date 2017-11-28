
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
		int max = m.getElement(0);
		if (m.length() > 0) {
			for (int i = 0; i <= m.length()-1; i++) {
				if (max < m.getElement(i)) {
					max = m.getElement(i);
				}
				else {	
				}
			}
		return max;
		}
	return -1;
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
		int a = 0;
		int b = 0;
		boolean isReverse = false;
		if (m.length() > 0) {
				for (int i=0; i<=m.length()-2; i++) {
					a =m.getElement(i);
					b =m.getElement(i+1);
					if (a>b) {
						isReverse = true;
					}
					else {
						isReverse = false;
						break;
					}
				}	
		}
	return isReverse;	
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
		int count = 0;
		for (int i=0; i<=m.length()-1; i++)
			if (m.getElement(i)==n) {
				count ++;
			}
		return count;
		
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
		int ans = n;
		for (int i=0; i < m -1; i++ )
			ans = ans * n;
			
		return ans;
			
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
		int a = 2;
		int b = 1;
		int c = a+b;
		int error = 0;
		
		if(n > 3) {
			for(int i=0; i<=n-2; i++) {
				c = a+b;
				a = b;
				b = c;
			}
		}
		else if (n>0) {
			return n;
		}
		else if (n==1) {
			return a;
		}
		else if (n==2) {
			return b;
		}
		else if (n==3) {
			return c;
		}
		else {
			return (error) ;
		}
		
	return c;		
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
		String image = "*";
		for (int i=0; i <= n-1; i++) {
			System.out.println(image);
			image = image+"*";
		}
	}

	//-------------------------------------------------------------------
	// 7. drawLine --> Prints a line of a given length
	//-------------------------------------------------------------------	
	public void drawLine(int n){
		String line = "_";
		for(int i=0; i<=n-1; i++) {
			line = line + "_";
		}
		System.out.println(line);
	}

}
