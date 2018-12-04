package per.design.patterns.command.advanced;


/**
 *
 */
public class LightOnCommand implements Command {

    private BedRoomLight light;

    public LightOnCommand(BedRoomLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
