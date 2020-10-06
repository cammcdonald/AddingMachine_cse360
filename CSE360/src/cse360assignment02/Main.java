package cse360assignment02;

/**
 * Test
 * @author cammc
 *
 */

public class Main {
	public static void main(String[] args) {
		  
		  AddingMachine myCalculator = new AddingMachine();
		  
		  myCalculator.add (4); 
		  myCalculator.subtract (2); 
		  myCalculator.add(5);
		  myCalculator.subtract(5);
		  myCalculator.add(7);
		  myCalculator.add(3);
		  
		  System.out.println(myCalculator.toString());
		  
		  System.out.println(myCalculator.getTotal());
		 

	}
}

