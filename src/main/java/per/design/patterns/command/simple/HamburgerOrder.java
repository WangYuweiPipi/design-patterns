package per.design.patterns.command.simple;

/**
 * 具体命令(ConcreteCommand)：这里是订单中具体要做的菜，获取到厨师具体做的是哪一道菜
 */
public class HamburgerOrder implements Order {

    private Chef chef;

    public HamburgerOrder(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.hamburger();
    }
}
