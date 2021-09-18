/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: StrapShort.java
 * 
 */
public class StrapShort implements Command{
	Straps st;
	int prevLength;
  
	public StrapShort(Straps st) {
		this.st = st;
	}
 
	public void execute() {
		prevLength = st.getStrapLength();
		st.shortS();
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
