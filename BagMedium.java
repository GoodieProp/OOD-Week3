/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: BagMedium.java
 * 
 */
public class BagMedium implements Command {
	BagSize bs;
	int prevSize;
  
	public BagMedium(BagSize bs) {
		this.bs = bs;
	}
 
	public void execute() {
		prevSize = bs.getSize();
		bs.medium();
	}
 
	public void undo() {
		if (prevSize == BagSize.SMALL) {
			bs.small();
		} else if (prevSize == BagSize.MEDIUM) {
			bs.medium();
		} else if (prevSize == BagSize.LARGE) {
			bs.large();
		} else if (prevSize == BagSize.NONE) {
			bs.noneB();
		}
	}
}
