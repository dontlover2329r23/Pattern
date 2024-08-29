package strategy;

public class Mallarduck extends Duc{
    public Mallarduck(){
        flybehavivor=new Flybehavivor1();
        quackebehavivor=new Quakebehavivor2();
    }
}
