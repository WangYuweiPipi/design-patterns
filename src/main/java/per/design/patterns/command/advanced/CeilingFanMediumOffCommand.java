package per.design.patterns.command.advanced;

public class CeilingFanMediumOffCommand implements Command {

    private CeilingFan ceilingFan;
    private int speed;

    public CeilingFanMediumOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
        speed = ceilingFan.getSpeed();
    }

    @Override
    public void undo() {
        if (speed == CeilingFan.HIGH){
            ceilingFan.high();
        } else if (speed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (speed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (speed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
