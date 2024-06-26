package Structural.Decorator;

public class FarmHousePizza implements Pizza{
    public String getDes(){
        return "FarmHouse Pizza";
    }
    public int cost(){
        return 600;
    }
}
