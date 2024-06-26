package Structural.Decorator;

import java.util.Scanner;
public class Client {
    private static int  choice;

    public static void main(String[] args){
        Pizza clientpizza;
        System.out.println("Select a Pizza.");
        System.out.println("1. Margherita Pizza");
        System.out.println("2. FarmHouse Pizza");
        System.out.println("Enter your choice ");
        Scanner myObj = new Scanner(System.in);
        choice = myObj.nextInt();
        switch(choice){
            case 1:{
                clientpizza= new MargheritaPizza();
            }
            break;
            case 2: {
                clientpizza = new FarmHousePizza();
            }
            break;
            default:{
                System.out.println("Invalid choice. Exiting...");
            }
            return;
        }
        System.out.println("Selected Pizza " + clientpizza.getDes()+" -Cost: " + clientpizza.cost());
        while (true){
            System.out.println("Select a Topping");
            System.out.println("1 - Cheese - Rs.30");
            System.out.println("2 - Olives - Rs.25");
            System.out.println("3 - Tomato - Rs.20");
            System.out.println("4 - Done.");
            System.out.println("Enter your choice");
            choice = myObj.nextInt();
            if(choice==4)break;
            switch (choice){
                case 1:{
                    clientpizza = new Cheese(clientpizza);
                }
                break;
                case 2:{
                    clientpizza = new Olives(clientpizza);
                }
                break;
                case 3:{
                    clientpizza = new Tomatoes(clientpizza);
                }
                break;
                default: {
                    System.out.println("Inavlid choice. try again");
                    continue;
                }

            }
            System.out.println("Updated Pizza: " + clientpizza.getDes()+" -Cost: " + clientpizza.cost());


        }
        System.out.println("Final order " + clientpizza.getDes()+" -Cost: " + clientpizza.cost());

    }
}
