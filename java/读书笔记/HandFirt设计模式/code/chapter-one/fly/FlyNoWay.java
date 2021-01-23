package fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞不起来");
    }
    
}