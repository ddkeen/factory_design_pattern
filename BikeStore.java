public class BikeStore {

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

        return null;

    }

    public Bike orderBike(String type) {
        return createBike(type);
    }
}
