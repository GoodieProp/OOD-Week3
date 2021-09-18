/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: MaterialPlastic.java
 * 
 */
public class MaterialPlastic implements Command {
	Material m;
	int prevMaterial;
  
	public MaterialPlastic(Material m) {
		this.m = m;
	}
 
	public void execute() {
		prevMaterial = m.getMaterial();
		m.plastic();
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
