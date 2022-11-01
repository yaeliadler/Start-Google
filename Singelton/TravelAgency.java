package Singelton;

public class TravelAgency {
    enum VehicleType{
        PLANE,
        BUS,
        TAXI,
        BOAT
    }
    public Agency createVehicle (VehicleType type){
        switch (type){
            case BUS:
                return new RentBus();
            case BOAT:
                return new RentBoat();
            case PLANE:
                return new RentPlane();
            case TAXI:
                return new REntTaxi();
            default:
                throw new IllegalArgumentException(String.format("Vehicle type not supported %s", type));
        }
    }
}
