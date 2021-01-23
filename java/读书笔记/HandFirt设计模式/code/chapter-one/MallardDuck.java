import fly.FlyWithWings;
import quack.Quack;

/**
 * 绿头鸭实现类
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("我是谁？？ 绿头鸭！！");
    }
}