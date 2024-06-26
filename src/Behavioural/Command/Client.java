package Behavioural.Command;
import java.util.Scanner;
public class Client {
    private static int choice;
    public static void main(String[] args){
        TV tv = new TV();
        Stereo stereo = new Stereo();
        Command turnontv = new TurnonCommand(tv);
        Command turnofftv = new TurnoffCommand(tv);
        Command turnonstereo = new TurnonCommand(stereo);
        Command turnoffStereo = new TurnoffCommand(stereo);
        Command adjustvolumestereo = new AdjustVolumeCommand(stereo);
        Command changechanneltv = new ChangeChannelCommand(tv);

        RemoteControl remote = new RemoteControl();
        Scanner myobj = new Scanner(System.in);
        while(true){
            System.out.println("Choose the command");
            System.out.println("1 - Turn on the tv");
            System.out.println("2 - Turn off the tv");
            System.out.println("3 - Change the channel on tv.");
            System.out.println("4 - Turn on the Stereo");
            System.out.println("5 - Turn off the Stereo");
            System.out.println("6 - Adjust Volume on Stereo");
            System.out.println("7 - I want to exit");
            choice  = myobj.nextInt();
            if(choice==7){

                break;
            }
            switch(choice){
                case 1:{
                    remote.setCommand(turnontv);
                }break;
                case 2:{
                    remote.setCommand(turnofftv);
                }break;
                case 3:{
                    remote.setCommand(changechanneltv);
                }break;
                case 4:{
                    remote.setCommand(turnonstereo);
                }break;
                case 5:{
                    remote.setCommand(turnoffStereo);
                }break;
                case 6:{
                    remote.setCommand(adjustvolumestereo);
                }break;
                default:{
                    System.out.println("Wrong Command! Press another button");
                    continue;
                }
            }
            remote.pressButton();

        }
        System.out.println("Exiting!");


    }
}
