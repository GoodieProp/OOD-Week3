/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: HandBagSelectionScreen.java
 * Uses: Takes in commands to be used in the program
 * 
 */
public class HandBagSelectionScreen {
	Command[] SelectOnCommands;
	Command[] SelectOffCommands;
	Command undoSelectCommand;
	
	public HandBagSelectionScreen() {
		SelectOnCommands = new Command[6];
		SelectOffCommands = new Command[6];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 6; i++) {
			SelectOnCommands[i] = noCommand;
			SelectOffCommands[i] = noCommand;
		}
		undoSelectCommand = noCommand;
	}
	
	public void setSelection(int slot, Command SelectOnCommand, Command SelectOffCommand ) {
		SelectOnCommands[slot] = SelectOnCommand;
		SelectOffCommands[slot] = SelectOffCommand;
	}
	
	public void onSelectTapped(int slot) {
		SelectOnCommands[slot].execute();
		undoSelectCommand = SelectOnCommands[slot];
	}
	
	public void offSelectTapped(int slot) {
		SelectOffCommands[slot].execute();
		undoSelectCommand = SelectOffCommands[slot];
	}
	
	public void undoSelect() {
		undoSelectCommand.undo();
	}
	
	// Shows what commands are within each slot
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < SelectOnCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + SelectOnCommands[i].getClass().getName()
				+ "    " + SelectOffCommands[i].getClass().getName() + "\n");
		}
		stringBuff.append("[undo] " + undoSelectCommand.getClass().getName() + "\n");
		return stringBuff.toString();
	}
}
