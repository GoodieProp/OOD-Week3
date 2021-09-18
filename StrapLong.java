/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: StrapLong.java
 * 
 */
public class StrapLong implements Command {
	Straps st;
	int prevLength;
  
	public StrapLong(Straps st) {
		this.st = st;
	}
 
	public void execute() {
		prevLength = st.getStrapLength();
		st.longS();
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
