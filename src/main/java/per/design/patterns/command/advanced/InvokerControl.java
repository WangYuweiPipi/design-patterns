package per.design.patterns.command.advanced;


public class InvokerControl {

    public void run() {
        Invoker invoker = new Invoker();

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
        invoker.buttonPushedUndo();

        invoker.buttonPushedOn(1);
        invoker.buttonPushedOn(1);
    }

}
