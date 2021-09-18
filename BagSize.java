/**
 * 
 */

/**
 * @author Xavier Gonzalez
 *
 */
public class BagSize {
	public static final int SMALL = 0;
	public static final int MEDIUM = 1;
	public static final int LARGE = 2;
	public static final int NONE = 3;
	String sizeDisplay;
	int size;
	
	public BagSize() {
		size = NONE;
	}
	
	public void small() {
		size = SMALL;
		System.out.println("The selected bag size is small");
	}
	
	public void medium() {
		size = MEDIUM;
		System.out.println("The selected bag size is medium.");
	}
	
	public void large() {
		size = LARGE;
		System.out.println("The selected bag size is large.");
	}
	
	public void noneB() {
		size = NONE;
		System.out.println("The selected bag size is none. Guess you're not getting a bag then.");
	}
	
	public int getSize() {
		/**
		if (size == 0) {
			sizeDisplay = "small";
		} else if (size == 1) {
			sizeDisplay = "medium";
		} else if (size == 2) {
			sizeDisplay = "large";
		} else if (size == 3) {
			sizeDisplay = "none";
		}**/
		return size;
	}
}

