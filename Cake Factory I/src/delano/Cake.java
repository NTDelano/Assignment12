package delano;

import java.util.ArrayList;

/**
 * The Class Cake. Adapter for all three cake types
 */
public abstract class Cake {
	
	/** The name of the cake */
	protected String name;
	
	/** The base flavor of the chosen cake */
	protected String baseFlavor;
	
	/** The ingredients. */
	protected ArrayList<String> ingredients;
	
	/**
	 * Gets the name of the cake.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the base flavor.
	 *
	 * @return the base flavor
	 */
	public String getBaseFlavor() {
		return baseFlavor;
	}
	
	/**
	 * Gets the ingredients.
	 *
	 * @return the ingredients
	 */
	public String getIngredients() {
		String str = "";
		for(int i = 0; i < ingredients.size(); i++) {
			str += "\n" + ingredients.get(i);
		}
		return str;
	}
	
	/**
	 * Prepare.
	 */
	public void prepare() {
		System.out.println("Preparing " + this.toString());
	}
	
	/**
	 * Bake.
	 */
	public void bake() {
		System.out.println("Baking " + this.toString());
	}
	
	/**
	 * Box.
	 */
	public void box() {
		System.out.println("Boxing " + this.toString());
	}
	
	/**
	 * To string containing the information from other methods
	 *
	 * @return the string
	 */
	public String toString() {
		return name + " with a base flavor of " + baseFlavor;
	}
}
