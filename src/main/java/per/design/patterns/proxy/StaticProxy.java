package per.design.patterns.proxy;

/**
 * 设计模式 - 静态代理
 */
public class StaticProxy {

    public static void main(String[] args) {

        Passenger passenger = new Passenger();

        TicketProxy proxy = new PassengerProxy(passenger);
        proxy.buyTicket();
        ((PassengerProxy) proxy).watingTicket();

    }
}

/**
 * 抽象接口类
 */
interface TicketProxy {

    /**
     * 买票
     */
    void buyTicket();
}


/**
 * 委托类 - 乘客
 */
class Passenger implements TicketProxy{

    @Override
    public void buyTicket() {
        System.out.println("乘客买票");
    }
}

/**
 * 代理类 - 黄牛
 */
class PassengerProxy implements TicketProxy {

    private Passenger passenger;


    public PassengerProxy(Passenger passenger) {
        this.passenger = passenger;
    }


    @Override
    public void buyTicket() {
        System.out.println("黄牛买票");
        passenger.buyTicket();
    }

    public void watingTicket() {
        System.out.println("黄牛等票");
    }
}


