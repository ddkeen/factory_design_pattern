/**
 * Driver for the Bike class and all its children
 * Creates 3 types of Bikes and prints their attributes and price
 * @author portiaportia
 */
public class BikeStoreDriver {

	public void runBikeStore() {
		BikeStore bikeStore = new BikeStore();
		
		Bike tricycle = bikeStore.orderBike("tricycle");
		System.out.println("\n-----------------------------------\n");
		
		Bike strider = bikeStore.orderBike("strider");
		System.out.println("\n-----------------------------------\n");
		
		Bike kidsBike = bikeStore.orderBike("kids bike");
		System.out.println("\n-----------------------------------\n");
	}
	public static void main(String[] args) {
		BikeStoreDriver driver = new BikeStoreDriver();
		driver.runBikeStore();
	}

}
