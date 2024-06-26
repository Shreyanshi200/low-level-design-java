package Structural.Adaptor;

public class IPhone6 implements IPhone{
    charger Iphone4to6adaptor;
    public IPhone6(charger iphone4to6adaptor){
        this.Iphone4to6adaptor = iphone4to6adaptor;
    };
    public void onCharge(){
        System.out.println("charging Iphone6");
        Iphone4to6adaptor.charge();
    }
}
