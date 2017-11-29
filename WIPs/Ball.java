/**
 * @author Tony Wang
 * CS310
 * Fall 2017
 */

/**
 *The Ball class contains a constructor to create a Ball object, receiving an int argument
 *Also contains a toString and getNumber method to retreive the value of the Ball object in String and int form
 */
class Ball {
	//you code here - variables, required methods, etc.
	
	//JDOC here?
	private int number;
	
	/**
	 * constructor method for Ball class that takes an int argument, sets it to this Ball object's number variable
	 */
	public Ball(int number) {
		this.number = number;
	}
	
	/**
	 * builds a string version of this ball object and returns the string version of this Ball object
	 */
	public String toString() {
		return "(" + this.number + ")";
	}
	
	/**
	 * returns the private int value this.number as an int
	 */
	public int getNumber() {
		return this.number;
	}
	
}