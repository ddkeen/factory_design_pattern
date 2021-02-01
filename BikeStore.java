public abstract class BikeStore {

    private abstract Bike createBike(String type);
    
    public Bike orderBike(String type) {
        Bike bike = createBike(String type);

        bike.createFrame();
        bike.addWheels();
        bike.addPedals();

        return bike;

    }
}
