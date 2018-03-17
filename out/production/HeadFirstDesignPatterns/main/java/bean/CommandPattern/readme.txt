命令模式：将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。

命令模式将发出请求的对象和执行请求的对象解耦。

本实例中，
调用者：遥控器SimpleRemoteControl；
命令：Command接口，具体开灯命令LightOnCommand等
接收者：电灯Light、风扇灯CeilingFan等