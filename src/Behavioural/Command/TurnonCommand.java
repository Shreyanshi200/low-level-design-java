package Behavioural.Command;
//concrete command
public class TurnonCommand implements Command{
    private Device device;
    TurnonCommand(Device device){
        this.device=device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
