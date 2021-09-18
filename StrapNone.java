/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: StrapNone.java
 * 
 */
public class StrapNone implements Command {
	Straps st;
	int prevLength;
  
	public StrapNone(Straps st) {
		this.st = st;
	}
 
	public void execute() {
		prevLength = st.getStrapLength();
		st.noneS();
	}
 
	public void undo() {
		if (prevLength == Straps.SHORT) {
			st.shortS();
		} else if (prevLength == Straps.MEDIUM) {
			st.mediumS();
		} else if (prevLength == Straps.LONG) {
			st.longS();
		} else if (prevLength == Straps.NONE) {
			st.noneS();
		}
	}
}

