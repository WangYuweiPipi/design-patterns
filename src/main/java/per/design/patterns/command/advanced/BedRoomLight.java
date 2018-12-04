package per.design.patterns.command.advanced;


/**
 * 接受者(receiver): 灯
 */
public class BedRoomLight implements Light {

    @Override
    public void on() {
        System.out.println("turn on the bedroom light");
    }

    @Override
    public void off() {
        System.out.println("turn off the bedroom light");
    }

}
