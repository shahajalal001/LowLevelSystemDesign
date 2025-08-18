package BehaviouralPatterns.CommandPattern;

interface Command {
    void execute();
}

class TextEditorII {
    public void boldText() {
        System.out.println("Text has been bolded.");
    }

    public void italicizeText() {
        System.out.println("Text has been italicized.");
    }

    public void underlineText() {
        System.out.println("Text has been underlined.");
    }

    public void changeColor(){
        System.out.println("Text color has been changed");
    }
}

class BoldCommand implements Command {
    private TextEditorII editorII;

    public BoldCommand(TextEditorII textEditorII){
        this.editorII = textEditorII;
    }

    @Override
    public void execute() {
        editorII.boldText();
    }
}

class ChangeColor implements Command{
    private TextEditorII editor;

    public ChangeColor(TextEditorII editor){
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.changeColor();
    }
}

class Button{
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void click(){
        command.execute();
    }
}

public class WithCommandPattern {
    public static void main(String[] args) {
        TextEditorII editorII = new TextEditorII();

        Button btn = new Button();
        btn.setCommand(new BoldCommand(editorII));
        // btn.setCommand(new ChangeColor(editorII));
        btn.click();
    }
}
