package Structural.Decorator;

public class ToppingsDecorator implements Pizza{
    private Pizza newPizza;
    public ToppingsDecorator(Pizza newPizza){
        this.newPizza = newPizza;
    }
    @Override
    public String getDes(){
        return newPizza.getDes();
    }
    @Override
    public int cost() {
        return newPizza.cost();
    }
}
