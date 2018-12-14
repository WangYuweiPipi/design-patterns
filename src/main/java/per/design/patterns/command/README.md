# 命令模式

## 定义
- 命令模式将“请求”封装成对象，以便使用不同的请求，队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。 
命令对象通过在特定的接受者上绑定一组动作来封装一个请求。这个对象只包含一个execute(）方法，当这个方法被调用时，接受者就会
命令模式可将“动作请求者(client)“从”动作执行者(receiver)”对象中节藕。

## 结构模式
- Client - 客户类
- Receiver - 接受者类
- Invoker - 调用者
- Command - 抽象命令类
- ConcreteCommand - 具体命令类



<!-- 图 -->
## 餐厅例子（simple）
论顾客、服务员、订单和厨师之间的运作模式  

- 顾客 - Client
- 厨师 - Receiver
- 服务员 - Invoker
- 订单 - Command
- 汉堡订单 - ConcredteCommand

## 开关灯遥控器例子（advanced）

## FAQ
- 命令模式的设计如何支持请求调用者和请求接受者之间的节藕？

