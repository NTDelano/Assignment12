package delano;

/**
 * A factory for creating Cake objects.
 */
public class CakeFactory {
	
	/**
	 * Order a cake based on the type specified
	 *
	 * @param type the type of cake order
	 * @return the cake to be made
	 */
	public Cake orderCake(String type) {
		if(type.equals("vanilla")) {
			return new VanillaCake();
		} else if(type.equals("chocolate")) {
			return new ChocolateCake();
		} else {
			return new LemonCake();
		}
	}
}
