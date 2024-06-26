package Structural.Decorator;

public class Cheese extends ToppingsDecorator{
    public Cheese(Pizza newPizza){
        super(newPizza);
    }
    public String getDes(){
        return super.getDes() + " With Cheese ";
    }
    public int cost(){
        return super.cost()+30;
    }
}
