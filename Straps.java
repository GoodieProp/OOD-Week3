/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: Straps.java
 * 
 */
public class Straps {
	public static final int SHORT = 0;
	public static final int MEDIUM = 1;
	public static final int LONG = 2;
	public static final int NONE = 3;
	int length;
	
	public Straps() {
		length = NONE;
	}
	
	public void shortS() {
		length = SHORT;
		System.out.println("Handbag's strap length is set to short.");
	}
	
	public void mediumS() {
		length = MEDIUM;
		System.out.println("Handbag's strap length is set to medium.");
	}
	
	public void longS() {
		length = LONG;
		System.out.println("Handbag's strap length is set to long.");
	}
	
	public void noneS() {
		length = NONE;
		System.out.println("Handbag's strap length is set to have no straps whatsoever. Now you have a handheld purse.");
	}
	
	public int getStrapLength() {
		return length;
	}
}
