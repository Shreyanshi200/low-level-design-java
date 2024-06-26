package Structural.Decorator;

public class MargheritaPizza implements Pizza{
    public String getDes(){
        return "Margherita Pizza";
    }
    public int cost(){
        return 300;
    }
}
