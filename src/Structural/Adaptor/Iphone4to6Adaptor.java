package Structural.Adaptor;

public class Iphone4to6Adaptor implements charger {
    Iphone4sCharger iphone4charger;
    Iphone4to6Adaptor(){
        iphone4charger = new Iphone4sCharger();
    }
    public void charge(){
        iphone4charger.charge();
    }
}
