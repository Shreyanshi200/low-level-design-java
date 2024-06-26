package Creational.Factory;
import java.util.Scanner;
public class driver {
    public static void main(String[] args){
        VehicleFactory TwoWheelerFactory = new TwoWheelerFactory();
        VehicleFactory FourWheelerFactory = new FourWheelerFactory();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Choose Vehicle you want: 1- Twowheeler 2- FourWheeler");

        int choice = myObj.nextInt();  // Read user input
        if(choice==1){
            Client twowheelerclient = new Client(TwoWheelerFactory);
            Vehicle twowheeler = twowheelerclient.getVehicle();
            twowheeler.printVehicle();
        }
        else{
            Client fourwheelerclient = new Client(FourWheelerFactory);
            Vehicle fourwheeler = fourwheelerclient.getVehicle();
            fourwheeler.printVehicle();
        }



    }
}
