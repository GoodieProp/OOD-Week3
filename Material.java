/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: Material.java
 * 
 */
public class Material {
	public static final int LEATHER = 0;
	public static final int COTTON = 1;
	public static final int PLASTIC = 2;
	public static final int NONE = 3;
	int hbMaterial;
	
	public Material() {
		hbMaterial = NONE;
	}
	
	public void leather() {
		hbMaterial = LEATHER;
		System.out.println("The selected material is leather.");
	}
	
	public void cotton() {
		hbMaterial = COTTON;
		System.out.println("The selected material is cotton.");
	}
	
	public void plastic() {
		hbMaterial = PLASTIC;
		System.out.println("The selected material is plastic");
	}
	
	public void noneM() {
		hbMaterial = NONE;
		System.out.println("The selected material is nothing. You essentially have a invisible bag.");
	}
	
	public int getMaterial() {
		return hbMaterial;
	}
}
