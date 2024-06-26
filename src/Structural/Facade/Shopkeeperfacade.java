package Structural.Facade;

public class Shopkeeperfacade {
    private Mobile iphone;
    private Mobile samsung;
    private Mobile blackberry;

    public Shopkeeperfacade(){
        iphone = new Iphone();
        samsung = new Samsung();
        blackberry = new Blackberry();
    }
    public void IphoneSale(){
        iphone.Model();
        iphone.price();
    }

    public void samsungSale(){
        samsung.Model();
        samsung.price();
    }
    public void BlackberrySale(){
        blackberry.Model();
        blackberry.price();
    }
}
