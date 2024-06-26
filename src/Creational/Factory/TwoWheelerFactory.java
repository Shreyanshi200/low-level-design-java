package Creational.Factory;

public class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle(){
        return new Twowheeler();
    }
}
