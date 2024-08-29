package Decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+", $"+beverage.cost());
        Beverage beverage1=new Mocha(beverage);
        System.out.println(beverage1.getDescription()+", $"+beverage1.cost());
    }
}
