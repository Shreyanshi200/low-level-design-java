package Behavioural.Command;

public class TV implements Device{
    @Override
    public void turnOn(){
        System.out.println("Tv is On");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv is off");
    }

    public void changeChannel(){
        System.out.println("Channel Changed");
    }
}
