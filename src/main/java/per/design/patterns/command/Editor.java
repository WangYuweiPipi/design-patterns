package per.design.patterns.command;

/**
 * 命令接受者：将一系列的操作录制下来，日后作为一个操作执行
 */
public interface Editor {

    void open();

    void close();

}
