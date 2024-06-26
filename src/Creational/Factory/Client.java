package Creational.Factory;

public class Client {
    private Vehicle pVehicle;
    public Client(VehicleFactory factory){
        pVehicle = factory.createVehicle();
    }
    public Vehicle getVehicle(){
        return pVehicle;
    }
}
