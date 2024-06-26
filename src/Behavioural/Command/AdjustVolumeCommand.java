package Behavioural.Command;
//concrete command

public class AdjustVolumeCommand implements Command{
    private Stereo stereo;
    AdjustVolumeCommand(Stereo stereo){
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        stereo.adjustVolume();
    }
}
