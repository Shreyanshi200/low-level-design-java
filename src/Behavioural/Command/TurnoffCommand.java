package Behavioural.Command;
//concrete command


public class TurnoffCommand implements Command{
    private Device device;
    TurnoffCommand(Device device){
        this.device=device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
