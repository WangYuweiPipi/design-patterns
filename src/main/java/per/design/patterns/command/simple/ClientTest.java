package per.design.patterns.command.simple;

/**
 * Client(顾客)：这是顾客,发起了一个订单，然后坐等就好，不需要知道我的菜是经历了什么样的流程
 */
public class ClientTest {

    public static void main(String[] args) {

        WaiterControl waiterControl = new WaiterControl();

        createOrder(waiterControl);
    }

    private static void createOrder(WaiterControl waiterControl) {
        waiterControl.run();
    }
}
