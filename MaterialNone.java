/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: MaterialNone.java
 * 
 */
public class MaterialNone implements Command {
	Material m;
	int prevMaterial;
  
	public MaterialNone(Material m) {
		this.m = m;
	}
 
	public void execute() {
		prevMaterial = m.getMaterial();
		m.noneM();
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
