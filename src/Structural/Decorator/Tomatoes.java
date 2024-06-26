package Structural.Decorator;

public class Tomatoes extends ToppingsDecorator{
    public Tomatoes(Pizza newPizza){
        super(newPizza);
    }
    public String getDes(){
        return super.getDes() + " With tomatoes ";
    }
    public int cost(){
        return super.cost()+20;
    }
}
