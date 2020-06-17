## 策略模式

从实现接口到组合

```
class Duck implements Action {
  ...

  @Override
  public void action(){
    System.out.print("i can dance");
  }
}

// 策略模式

class Duck extend AbstractDuck {

  private AbstractAction duckAction;

  @Override
  public void action(){
    duckAction.action();
  }

  public void setAction(AbstractAction duckAction){
    this.duckAction = duckAction;
  }
}

```
