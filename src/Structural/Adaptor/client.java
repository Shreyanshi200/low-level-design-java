package Structural.Adaptor;

public class client {
    public static void main(String[] args){
        IPhone iphone6 = new IPhone6(new Iphone4to6Adaptor());
        iphone6.onCharge();

    }
}
