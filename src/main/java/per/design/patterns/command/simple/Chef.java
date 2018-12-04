package per.design.patterns.command.simple;

/**
 * 接受者(Receiver) - (也可以是接口，封装一系列的方法): 这是大厨，不同的方法代表他做出的不同的菜
 */

public class Chef {

    public void hamburger() {
        System.out.println("This is a hamburger");
    }
}
