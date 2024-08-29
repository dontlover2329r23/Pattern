package strategy;

public abstract class Duc {
     Flybehavivor flybehavivor;
     Quackebehavivor quackebehavivor;
    private int size;
    public  void fly(){
        flybehavivor.fly();
    }
    public void quake(){
        quackebehavivor.quake();
    }
    public int getSize(){
        return size;
    }

}
