import fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck malolard = new MallardDuck();
        malolard.display();
        malolard.performQuack();
        malolard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();

        System.out.println("超级变换形态");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        
    }
    
}