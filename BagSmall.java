/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: BagSmall.java
 * 
 */
public class BagSmall implements Command {
	BagSize bs;
	int prevSize;
  
	public BagSmall(BagSize bs) {
		this.bs = bs;
	}
 
	public void execute() {
		prevSize = bs.getSize();
		bs.small();
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
