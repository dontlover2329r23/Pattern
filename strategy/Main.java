package strategy;

public class Main {
    public static void main(String[] args) {
        Duc duc=new Robberduck();
        System.out.println("Robber duck:");
        duc.fly();
        duc.quake();
        Duc mallarduck=new Mallarduck();
        mallarduck.fly();
        mallarduck.quake();
    }
}
