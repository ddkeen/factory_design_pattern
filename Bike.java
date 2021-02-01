public abstract class Bike {

    protected String name;
    protected Double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

	
	public void createBike() {

        createFrame();
        addPedals();
        addWheels();
        addPedals();
	}
	
	private void createFrame() {
		System.out.println("Assembling " + name + " frame");
	}
	
	private void addWheels() {
        if(numWheels != 0) {
            System.out.println("Adding " + numWheels + " wheels");
            if(hasTrainingWheels) {
                System.out.print("Adding Training Wheels");
            }
        }
	}
	
	private void addPedals() {
        if(hasPedals) {
            System.out.println("Adding Pedals");
        }
	}
	
	public void getPrice() {
		System.out.println(price);
	}
    
}
