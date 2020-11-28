package delano;

public class AppDriver {

	public static void main(String[] args) {
		CakeFactory cakeFactory = new CakeFactory();
		CakeStore store = new CakeStore(cakeFactory);
		Cake cake1 = store.onlineOrder("lemon");
		Cake cake2 = store.onlineOrder("chocolate");
		Cake cake3 = store.onlineOrder("vanilla");
		
		System.out.println("Completed Order: " + cake1.getName());
		System.out.println("Completed Order: " + cake2.getName());
		System.out.println("Completed Order: " + cake3.getName());
	}

}
