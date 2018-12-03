package per.design.patterns.SimpleExample;

/**
 * 调用者(Invoker) : 这是服务员，他可以从客户那里获取订单，并调用订单中的方法(即将订单给厨师，在这里他不需要知道订单里点了什么菜，只要通知厨师开始准备菜)
 */
public class Waiter {

    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public void callChef() {
        order.execute();
    }
}
