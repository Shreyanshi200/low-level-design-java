package Structural.Facade;

public class Samsung implements Mobile{
    @Override
    public void Model() {
        System.out.println("Samsung Galaxy tab 3");
    }

    @Override
    public void price() {
        System.out.println("Rs. 45000");
    }
}
