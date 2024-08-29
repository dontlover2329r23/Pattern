package strategy;

public class Robberduck extends Duc{
    public Robberduck(){
        flybehavivor=new Flybehavivor2();
        quackebehavivor=new Quakebehavivor3();
    }
}
