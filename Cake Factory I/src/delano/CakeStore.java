package delano;

/**
 * The Class CakeStore.
 */
public class CakeStore {
	
	/** The cake factory. */
	private CakeFactory cakeFactory;
	
	/**
	 * Instantiates a new cake store.
	 *
	 * @param cakeFactory the cake factory
	 */
	public CakeStore(CakeFactory cakeFactory) {
		this.cakeFactory = cakeFactory;
	}
	
	/**
	 * Online order.
	 *
	 * @param type the type
	 * @return the cake
	 */
	public Cake onlineOrder (String type) {
		//PROCESS 1: COMPLETE THE ONLINE ORDER
		Cake cake = cakeFactory.orderCake(type);
		
		//PROCESS 2: PREPARATION OF THE CAKE
		cake.prepare();
		cake.bake();
		cake.box();
		
		return cake;
	}
}
