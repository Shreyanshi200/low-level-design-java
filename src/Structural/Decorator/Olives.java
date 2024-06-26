package Structural.Decorator;

public class Olives extends ToppingsDecorator{
    public Olives(Pizza newPizza){
        super(newPizza);
    }
    public String getDes(){
        return super.getDes() + " With Olives ";
    }
    public int cost(){
        return super.cost()+25;
    }
}
