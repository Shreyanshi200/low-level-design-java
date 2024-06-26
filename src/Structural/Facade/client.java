package Structural.Facade;
import java.util.Scanner;
public class client {
    private static int choice;
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        do {
            System.out.print("========= Mobile Shop ============ \n");
            System.out.print("            1. IPHONE.              \n");
            System.out.print("            2. SAMSUNG.              \n");
            System.out.print("            3. BLACKBERRY.            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");
            choice = myobj.nextInt();
            Shopkeeperfacade sk = new Shopkeeperfacade();
            switch(choice){
                case 1:
                {
                    sk.IphoneSale();
                }
                break;
                case 2:
                {
                    sk.samsungSale();
                }
                break;
                case 3:
                {
                    sk.BlackberrySale();
                }
                break;
                default:
                {
                    System.out.println("Nothing You purchased");
                }
                return;
            }
        }while (choice!=4);
    }

}
