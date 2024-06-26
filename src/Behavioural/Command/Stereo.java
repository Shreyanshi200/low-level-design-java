package Behavioural.Command;

public class Stereo implements Device{
    @Override
    public void turnOff() {
        System.out.println("Stereo is Off.");
    }

    @Override
    public void turnOn() {
        System.out.println("Stereo is On");
    }

    public void adjustVolume(){
        System.out.println("Volume Adjusted.");
    }
}
