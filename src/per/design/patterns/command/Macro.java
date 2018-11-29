package per.design.patterns.command;

import java.util.List;

/**
 * 发起者：控制一个或多个命令的顺序和执行
 */
public class Macro {

    private List<Action> actions;

    public void add(Action action) {
        actions.add(action);
    }

    public void run() {
        actions.forEach(Action::perform);
    }
}
