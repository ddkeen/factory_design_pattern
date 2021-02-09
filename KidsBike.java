/**
 * KidsBike class that inherits from the Bike Class
 * @author ddkeen
 */
public class KidsBike extends Bike {

    /**
     * Kidsbike contructor that sets its name, price, number of wheels, and whether it has pedals and/or training wheels
     */
    public KidsBike() {
        name = "Kids Bike";
        price = 80.99;
        numWheels = 2;
        hasPedals = true;
        hasTrainingWheels = true;
    }
}
