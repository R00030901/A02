

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
	// 1. recursiveDisplayElements --> Displays all elements of a MyDynamicList  
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyDynamicList, this recursive algorithm displays its elements by screen (if any).
	 * @param m: The MyDynamicList we want to display its elements.	  
	 * @return 
	 */	
	public void recursiveDisplayElements(MyDynamicList m){

		int size = m.length();
		//int res = 0;
		
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 
		
		//Rule 1. MyDynamicList is empty
		if (size == 0) 
			scenario = 1;
		//Rule 2. MyDynamicList is non-empty
		else
			scenario = 2; 
		
			
	
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
		
		case 1: 
			//1. We print the empty message
			System.out.println("Empty MyDynamicList");
			
			break;	
			
			//Rule 2. MyDynamicList is non-empty
			case 2: 
				//1. We print the items @ index 0 while removing that item
				int e0 =  m.getElement(0);
				m.removeElement(0);
				System.out.println(e0);
				//res = recursiveDisplayElements(m);
				recursiveDisplayElements(m);
				//res = e0+res;
				//System.out.println(res);
				//System.out.println("end of recursion");
				m.addElement(0, e0);
				//for (int i = 0; i < size; i++)
					//System.out.println("Item " + i + ": " + m.getElement(i));
				break;
				
		}
		//return res;			
	}

	//-------------------------------------------------------------------
	// 2. smallerMyList --> Filters all elements in MyDynamicList smaller than e
	//-------------------------------------------------------------------	
	/**
	 * The function filters all elements of MyDynamicList being smaller than 'e'  
	 * @param m: The MyDynamicList we want to check.
	 * @param e: The number 'e' we want to compare each element of MyDynamicList to.
	 * @return: The new MyDynamicList containing just the elements being smaller than 'e'  
	 */	
	public MyDynamicList smallerMyList(MyDynamicList m, int e){

		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		MyDynamicList resM = new MyDynamicList();

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
		
		case 1: 
			//1. We print the empty message
			System.out.println("Empty list");
			
			break;	
			
			//Rule 2. MyDynamicList is non-empty
			case 2: 
				//1. identify items smaller than e & assign them to a separate myDynamicalist
				int e0 = m.getElement(0);
				m.removeElement(0);
				resM = smallerMyList(m,e);
				m.addElement(0, e0);
				if(e > e0) {
					resM.addElement(0, e0);
					
				}
				else {
					
				}
			}
		
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------			
		return resM;
		
	}

	//-------------------------------------------------------------------
	// 3. biggerMyList --> Filters all elements in MyDynamicList bigger than e
	//-------------------------------------------------------------------	
	/**
	 * The function filters all elements of MyDynamicList being bigger than 'e'  
	 * @param m: The MyDynamicList we want to check.
	 * @param e: The number 'e' we want to compare each element of MyDynamicList to.
	 * @return: The new MyDynamicList containing just the elements being bigger or equal than 'e'  
	 */	
	public MyDynamicList biggerEqualMyList(MyDynamicList m, int e){
		
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		MyDynamicList resM = new MyDynamicList();

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
		
		case 1: 
			//1. We print the empty message
			System.out.println("Empty list");
			
			break;	
			
			//Rule 2. MyDynamicList is non-empty
			case 2: 
				//1. identify items bigger than e & assign them to a separate myDynamicalist
				int e0 = m.getElement(0);
				m.removeElement(0);
				resM = biggerEqualMyList(m,e);
				m.addElement(0, e0);
				if(e < e0) {
					resM.addElement(0, e0);
					
				}
				else {
					
				}
			}
		
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------			
		return resM;
		
	}	
	//-------------------------------------------------------------------
	// 3. concatenate --> It concatenates 2 MyDynamicList   
	//-------------------------------------------------------------------	
	/**
	 * The function concatenates the content of 2 MyDynamicList.   
	 * @param m1: The first MyDynamicList.
	 * @param m2: The second MyDynamicList.
	 * @return: The new MyDynamicList resulting of concatenate the other 2 MyDynamicList
	 */	
	public MyDynamicList concatenate(MyDynamicList m1, MyDynamicList m2){
		
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		MyDynamicList res = new MyDynamicList();

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
int scenario = 0; 	
		
		//Rule 1. MyDynamicList is empty
				if (m1.length() == 0 && m2.length() == 0) 
					scenario = 1;
				
				else if (m1.length() == 0)
					scenario = 2;
				
				else if (m2.length() == 0)
					scenario = 3;
				//Rule 4. MyDynamicList is non-empty
				else
					scenario = 4;
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
		
		case 1: 
			//1. We print the empty message
			System.out.println("Empty list");
			
			break;
			
		case 2:
			return m2;
			
		case 3:
			return m1;
			
		//Rule 2. MyDynamicList is non-empty
			case 4: 
				//1. identify items bigger than e & assign them to a separate myDynamicalist
				int e0 = m1.getElement(0);
				int e1 = m2.getElement(0);
				m1.removeElement(0);
				m2.removeElement(0);
				res = concatenate(m1,m2);
				//m1.addElement(0, e0); causing duplicate items to show up in concatenated lists
				//m2.addElement(0, e1);
				res.addElement(0, e0);
				res.addElement(res.length(), e1);
			}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;
		
	}
	
}

