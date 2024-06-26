package Structural.Facade;

public class Blackberry implements Mobile{
    @Override
    public void Model() {
        System.out.println("Blackberry Z10");
    }

    @Override
    public void price() {
        System.out.println("Rs. 55000");
    }
}
