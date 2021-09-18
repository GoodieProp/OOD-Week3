/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: HandBagSelectionLoader.java
 * Uses: Used as a main class to run the program
 * 
 */
public class HandBagSelectionLoader {

	public static void main(String[] args) {
		HandBagSelectionScreen hbs = new HandBagSelectionScreen();
		
		
		//----------------------------------------------------------------------Straps
		
		// Straps Initialized
		Straps s = new Straps();
		StrapShort sS = new StrapShort(s);
		StrapLong sL = new StrapLong(s);
		StrapMedium sM = new StrapMedium(s);
		StrapNone sN = new StrapNone(s);
		
		// Straps commands 
		System.out.println("\n----Handbag Strap Command Selection----\n");
		hbs.setSelection(0, sS, sN);
		hbs.setSelection(1, sL, sN);
		hbs.setSelection(2, sM, sN);
		
		hbs.onSelectTapped(2);
		hbs.undoSelect();
		hbs.onSelectTapped(2);
		hbs.onSelectTapped(1);
		hbs.undoSelect();
		hbs.onSelectTapped(0);
		hbs.offSelectTapped(0);
		
		// For debugging uses | Shows what commands are in each slot | remove comment if needed
		//System.out.println(hbs);
		
		//----------------------------------------------------------------------BagSize
		
		BagSize bs = new BagSize();
		BagSmall bS = new BagSmall(bs);
		BagMedium bM = new BagMedium(bs);
		BagLarge bL = new BagLarge(bs);
		BagNone bN = new BagNone(bs);
		System.out.println("\n----Hand Bag Size Command Selection----\n");
		
		// Bag Size commands
		hbs.setSelection(0, bM, bN);
		hbs.setSelection(1, bL, bN);
		hbs.setSelection(2, bS, bN);
		hbs.onSelectTapped(0);
		hbs.offSelectTapped(0);
		hbs.undoSelect();
		hbs.onSelectTapped(1);
		hbs.undoSelect();
		hbs.onSelectTapped(2);
		hbs.offSelectTapped(2);
		
		// For debugging uses | Shows what commands are in each slot | remove comment if needed
		//System.out.println(hbs);
		
		//----------------------------------------------------------------------Material
		
		Material m = new Material();
		MaterialLeather mL = new MaterialLeather(m);
		MaterialCotton mC = new MaterialCotton(m);
		MaterialPlastic mP = new MaterialPlastic(m);
		MaterialNone mN = new MaterialNone(m);
		
		// Material Commands
		System.out.println("\n----Hand Bag Material Command Selection----\n");
		hbs.setSelection(0, mL, mN);
		hbs.setSelection(1, mC, mN);
		hbs.setSelection(2, mP, mN);
		hbs.setSelection(3, mL, mN);
		
		hbs.onSelectTapped(0);
		hbs.offSelectTapped(0);
		hbs.undoSelect();
		hbs.onSelectTapped(1);
		hbs.undoSelect();
		hbs.offSelectTapped(1);
		hbs.onSelectTapped(2);
		
		
		
		// For debugging uses | Shows what commands are in each slot | remove comment if needed
		//System.out.println(hbs);
	}

}
