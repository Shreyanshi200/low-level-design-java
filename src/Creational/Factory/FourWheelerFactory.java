package Creational.Factory;

public class FourWheelerFactory implements VehicleFactory{
    public Vehicle createVehicle(){
        return new Fourwheeler();
    }
}
