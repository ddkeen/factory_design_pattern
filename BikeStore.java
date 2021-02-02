/**
 * BikeStore class that orders different types of bikes and creates them
 * @author ddkeen
 */
public class BikeStore {

    /**
     * Creates a tricycle, strider, or kidsbike based off the parameter passed
     * @param type a string signifying the type of bike to create
     * @return the bike that was created or null if the parameter is not a valid type
     */
    private Bike createBike(String type) {

        if(type.equals("tricycle")) {
            Tricycle tricycle = new Tricycle();
            tricycle.createBike();
            return tricycle;
        }
        else if (type.equals("strider")) {
            Strider strider = new Strider();
            strider.createBike();
            return strider;
        }
        else if (type.equals("kids bike")) {
            KidsBike kidsBike = new KidsBike();
            kidsBike.createBike();
            return kidsBike;
        }
        System.out.println("Not a valid type of bike!");
        return null;
    }

    /**
     * Orders a tricycle, strider, or kidsbike based off the parameter passed
     * @param type a string signifying the type of bike to create
     * @return the bike that was created
     */
    public Bike orderBike(String type) {
        return createBike(type);
    }
}
