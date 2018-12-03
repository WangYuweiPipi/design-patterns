package per.design.patterns.command;

/**
 *
 */
public class CloseImpl implements Action {

    private final Editor editor;

    public CloseImpl(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.close();
    }
}
