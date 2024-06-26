package Creational.AbstractFactory;

class NACarfactory implements CarFactory {
    public Car createCar(){
        return new Sedan();
    }
    public CarSpecification createSpecification(){
        return new NASpecification();
    }
}


class EuCarFactory implements CarFactory {
    public Car createCar() {
        return new HatchBack();
    }

    public CarSpecification createSpecification() {
        return new EuSpecification();
    }
}