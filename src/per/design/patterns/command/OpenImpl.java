package per.design.patterns.command;

public class OpenImpl implements Action {


    private final Editor editor;

    public OpenImpl(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.open();
    }
}
