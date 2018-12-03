package per.design.patterns.SimpleExample;

/**
 * 这是业务逻辑层，方法内封装了一系列服务员该做的事，作为客户，只需要调用此方法(即喊一声服务员，并告诉他要点什么菜)，就可以等吃了
 */
public class WaiterControl {

    public void run() {

        Chef chef = new Chef();
        HamburgerOrder hamburgerOrder = new HamburgerOrder(chef);

        Waiter waiter = new Waiter();
        waiter.setOrder(hamburgerOrder);
        waiter.callChef();
    }
}
