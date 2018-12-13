package per.design.patterns.command.advanced;

/**
 *
 */
public class KitchenLight implements Light {

    @Override
    public void on() {
        System.out.println("turn on the kitchen light");
    }

    @Override
    public void off() {
        System.out.println("turn off the kitchen light");
    }
}
