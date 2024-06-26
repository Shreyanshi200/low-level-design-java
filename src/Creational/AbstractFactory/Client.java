package Creational.AbstractFactory;
import java.util.Scanner;
public class Client {
    public static void main(String[] args){
        CarFactory NAfactory = new NACarfactory();
        CarFactory Eufactory = new EuCarFactory();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter choice of car ");
        System.out.println("1- Sedan Car with NorthAmerican Specification ");
        System.out.println("2- Sedan Car with European Specification");
        System.out.println("3- HatchBack Car with NorthAmerican Specification ");
        System.out.println("4- Hatchback Car with European Specification ");
        int choice = myObj.nextInt();
        if(choice==1){
            Car NACar = NAfactory.createCar();
            CarSpecification NAspec = NAfactory.createSpecification();
            NACar.assemble();
            NAspec.display();
        }
        else if(choice==2){
            Car NACar = NAfactory.createCar();
            CarSpecification NAspec = Eufactory.createSpecification();
            NACar.assemble();
            NAspec.display();
        }
        else if(choice==3){
            Car Eucar = Eufactory.createCar();
            CarSpecification NAspec = NAfactory.createSpecification();
            Eucar.assemble();
            NAspec.display();
        }
        else if(choice==4){
            Car Eucar = Eufactory.createCar();
            CarSpecification EUspec = Eufactory.createSpecification();
            Eucar.assemble();
            EUspec.display();
        }
        else{
            System.out.println(" Deafult:Hatchback Car with european specification");
            Car Eucar = Eufactory.createCar();
            CarSpecification EUspec = Eufactory.createSpecification();
            Eucar.assemble();
            EUspec.display();
        }


    }


}
