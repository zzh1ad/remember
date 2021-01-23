import fly.FlyNoWay;
import quack.Quack;

/**
 * 模型鸭实现类
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("我是谁？？ 模型鸭！！");
    }
}