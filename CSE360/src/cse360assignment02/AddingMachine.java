package cse360assignment02;

/** 
 * Adding Machine Original State
 * @author Cameron McDonald
 *
 */

public class AddingMachine {
  private int total;
  private String plus = " + ";
  private String minus = " - ";
  private String eq = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return total; //return current total 
  }
  
  public void add (int value) {
	  total = total + value; //add to total variable 
	  eq += plus + value; //add input to eq
  }

  public void subtract (int value) {
	  total = total - value; //subtract from total variable
	  eq += minus + value; //add input to eq
  }

  public String toString () {
    return eq; //return eq
  }

  public void clear() {
	  total = 0; //clear AddingMachine
  }
	
}



