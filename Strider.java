/**
 * Strider class that inherits from the Bike Class
 * @author ddkeen
 */
public class Strider extends Bike {

    /**
     * Strider contructor that sets its name, price, number of wheels, and whether it has pedals and/or training wheels
     */
    public Strider() {

        name = "Strider";
        price = 65.99;
        numWheels = 2;
        hasPedals = false;
        hasTrainingWheels = false;
    } 
}
