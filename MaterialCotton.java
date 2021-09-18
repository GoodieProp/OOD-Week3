/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: MaterialCotton.java
 * 
 */
public class MaterialCotton implements Command {
	Material m;
	int prevMaterial;
  
	public MaterialCotton(Material m) {
		this.m = m;
	}
 
	public void execute() {
		prevMaterial = m.getMaterial();
		m.cotton();
	}
 
	public void undo() {
		if (prevMaterial == Material.LEATHER) {
			m.leather();
		} else if (prevMaterial == Material.COTTON) {
			m.cotton();
		} else if (prevMaterial == Material.PLASTIC) {
			m.plastic();
		} else if (prevMaterial == Material.NONE) {
			m.noneM();
		}
	}
}
