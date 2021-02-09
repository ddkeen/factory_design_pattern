/**
 * Abstract class that is the parent class of all Bike objects including
 * KidsBikes, Tricycles, and Striders
 * All bikes have a type, price, number of wheels, and can also have pedals and training wheels
 * @author ddkeen
 */
public abstract class Bike {

    protected String name;
    protected Double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /**
     * Creates a bike by adding a frame, wheels, pedals, and a price
     */
    public void createBike() {
        createFrame();
        addWheels();
        addPedals();
        getPrice();
    }
    
    /**
     * Prints a representation of the frame being built for the particular bike
     */
    private void createFrame() {
        System.out.println("Assembling " + name + " frame");
    }
    
    /**
     * Prints a representation of the number of wheels and training wheels being added for the particular bike if it has them
     */
    private void addWheels() {
        if(numWheels != 0) {
            System.out.println("Adding " + numWheels + " wheel(s)");
            if(hasTrainingWheels) {
                System.out.println("Adding training wheels");
            }
        }
    }
    
    /**
     * Prints a representation of the pedals being added for the particular bike if it has them
     */
    private void addPedals() {
        if(hasPedals) {
            System.out.println("Adding pedals");
        }
    }
    
    /**
     * Prints a representation of the price of the particular bike
     */
    public void getPrice() {
	    System.out.println("Price: $" + price);
    }
    
}
