package per.design.patterns.command.advanced;

/**
 * 调用者
 */
public class Invoker {

    private Command[] commandOn; // 开
    private Command[] commandOff; // 关
    private Command commandUndo; //撤回

    public Invoker() {
        /* 实例化此开关数组 */
        this.commandOn = new Command[3];
        this.commandOff = new Command[3];

        /* 初始化此开关数组, 确保每次调用都有命令对象 */
        Command noCommand= new NoCommand();
        for (int i = 0; i < 3; i++) {
            commandOn[i] = noCommand;
            commandOff[i] = noCommand;
        }
        commandUndo = noCommand;
    }

    public void setCommand(int index, Command commandOn, Command commandOff) {
        this.commandOn[index] = commandOn;
        this.commandOff[index] = commandOff;
    }


    public void buttonPushedOn(int index) {
        commandOn[index].execute();
        commandUndo = commandOn[index]; //记录操作按钮
    }

    public void buttonPushedOff(int index) {
        commandOff[index].execute();
        commandUndo = commandOff[index];
    }

    public void buttonPushedUndo() {
        commandUndo.undo();
    }
}
