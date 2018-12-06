package per.design.patterns.command.advanced;

/**
 * 命令：
 */
public interface Command {

    /* 启动开关命令 */
    void execute();

    /* 撤销命令 - 即上个命令的倒转命令 */
    void undo();
}
