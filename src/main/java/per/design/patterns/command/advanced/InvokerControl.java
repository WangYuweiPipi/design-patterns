package per.design.patterns.command.advanced;

/**
 * 具体调用实例
 */
public class InvokerControl {

    public void run() {
        Invoker invoker = new Invoker();

        /* 开关灯、撤销操作 */
        int index = 0;
        Light bedroomLight = new BedRoomLight();
        Command bedroomCommandOn = new LightOnCommand(bedroomLight);
        Command bedroomCommandOff = new LightOffCommand(bedroomLight);
        invoker.setCommand(index, bedroomCommandOn, bedroomCommandOff);

        index = 1;
        Light kitchenLight = new KitchenLight();
        Command kitchenCommandOn = new LightOnCommand(kitchenLight);
        Command kitchenCommandOff = new LightOffCommand(kitchenLight);
        invoker.setCommand(index, kitchenCommandOn, kitchenCommandOff);

        invoker.buttonPushedOn(0);
        invoker.buttonPushedOff(0);
        System.out.println("undo off to on:");
        invoker.buttonPushedUndo();

        System.out.println("\n");

        invoker.buttonPushedOn(1);
        invoker.buttonPushedOn(1);

    }

}
