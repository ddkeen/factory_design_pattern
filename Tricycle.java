/**
 * Tricycle class that inherits from the Bike class
 * @author ddkeen
 */
public class Tricycle extends Bike {

    /**
     * Tricycle contructor that sets its name, price, number of wheels, and whether it has pedals and/or training wheels
     */
    public Tricycle() {
        name = "Tricycle";
        price = 54.95;
        numWheels = 3;
        hasPedals = true;
        hasTrainingWheels = false;
    }
    
}
