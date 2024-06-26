package Creational.AbstractFactory;

class Sedan implements Car{
    public void assemble(){
        System.out.println("Assembling Sedan Car.");
    }
}
class HatchBack implements Car{
    public void assemble(){
        System.out.println("Assembling Hatchback car");
    }
}

class NASpecification implements CarSpecification {
    public void display(){
        System.out.println("North America Car Specification: Safety features compliant with local regulations.");
    }

}

class EuSpecification implements CarSpecification {
    public void display() {
        System.out.println("Europe Car Specification:  Fuel efficiency and emissions compliant with EU standards.");
    }
}