观察者模式
在对象之间建立一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象都会收到通知，并自动更新。
可以自己写一个观察者接口，也可以用系统内置的观察者接口，但是系统内置的只能继承，违反了“针对接口编程，不针对实现编程”的设计原则；
查看ObservableAPI,你会发现setChanged()方法被保护了起来，这意味着：除非你继承Observable,否则你无法创建Observable实例并组合到你自己
的对象中来，这违反了第二个设计原则：“多用组合，少用继承”。
系统内置的可采用“推”或者“拉”的方式，拉相对于推的优点在于每个观察者需要的数据种类有可能不一样，如果主
动推的话有可能会有一些不需要的数据，且难以维护，而主动拉可以让各个观察者方便实现、修改自己的方法。

设计原则
为交互对象之间的松耦合设计而努力


