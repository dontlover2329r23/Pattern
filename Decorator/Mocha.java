package Decorator;

public class Mocha extends  CondimentDecorator{
    public Mocha(Beverage beverage){
        super(beverage);
    }
    public String getDescription(){
        return beverage.getDescription()+" , Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.20;
    }
}
