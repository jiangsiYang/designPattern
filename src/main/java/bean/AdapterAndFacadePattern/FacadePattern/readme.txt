外观模式：提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。

外观不只是简化了接口，也将客户从组件的子系统中解耦。
外观和适配器可以包装许多类，但是外观的意图是简化接口，而适配器的意图是将接口转换成不同的接口。
当需要简化并统一一个很大的接口或者一群复杂的接口时，使用外观。

设计原则：
最少知识原则：只和你的密友谈话。
这个原则提供了一些方针：就任何对象而言，在该对象的方法内，我们只应该调用属于以下范围的方法：
1、该对象本身
2、被当做方法的参数而传递进来的对象
3、此方法所创建或实例化的任何对象
4、对象的任何组件（把“组件”想象成是被实例变量所引用的任何对象，换句话说，把这想象成是“有一个”（HAS-A）关系）

例如：不采用以下原则
public float getTemp(){
    Thermometer thermometer  = station.getThermometer();    //从气象站取得温度计对象
    return thermometer.getTemperature();    //从温度计取得温度
}

采用以下原则
public float getTemp(){
    return station.getTemperature();    //符合以上方针4，从气象站取得温度，关于气象站如何取得温度，那不管我们事
}

最少知识原则的缺点：
导致更多的“包装”类被制造出来，以处理和其他组件的沟通，这可能会导致复杂度和开发时间的增加，并降低运行时的性能。

具体例子：
public class Car{
    Engine engine;

    public Car(){}

    public void start(Key key){
        Doors doors = new Doors();
        boolean authorized = key.turns();   //符合2

        if(authorized){
            engine.start();     //符合4
            updateDashboardDisplay();   //符合1
            doors.lock();   //符合3
        }
    }

    public void updateDashboardDisplay(){

    }
}


