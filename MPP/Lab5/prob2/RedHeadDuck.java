package prob2;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {

        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {

        System.out.println("  displaying");

    }
}
