package Behavioural.Command;

public class ChangeChannelCommand implements Command{
    private TV tv;
    ChangeChannelCommand(TV tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
