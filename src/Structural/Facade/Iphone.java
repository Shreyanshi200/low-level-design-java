package Structural.Facade;

public class Iphone implements Mobile {
    @Override
    public void Model() {
        System.out.println("Iphone 6");
    }

    @Override
    public void price() {
        System.out.println("Rs. 65000");
    }
}
