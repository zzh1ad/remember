import quack.*;
import fly.*;

abstract class Duck {
    // // 呱呱叫
    // protected abstract void quack();

    // // 游泳
    // protected abstract void swim();

    // // 外观
    // protected abstract void display();

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}