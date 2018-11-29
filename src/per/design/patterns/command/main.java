package per.design.patterns.command;

public class main {

    public static void main(String[] args) {

        Editor editor = null;

        Macro macro = new Macro();

        macro.add(new OpenImpl(editor));
//        macro.add(() -> editor.open());

        macro.add(new CloseImpl(editor));
//        macro.add(() -> editor.open());

        macro.run();
    }

}
