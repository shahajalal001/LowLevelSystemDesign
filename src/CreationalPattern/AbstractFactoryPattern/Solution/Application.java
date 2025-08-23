package CreationalPattern.AbstractFactoryPattern.Solution;

interface Button{
    void render();
}

interface ScrollBar{
    void scroll();
}

class WindowsButton implements Button{

    @Override
    public void render() {
        System.out.println("Rendering windows button");
    }

}

class WindowsScrollBar implements ScrollBar{

    @Override
    public void scroll() {
        System.out.println("Scrolling windows scrollbar");
    }

}

class MacOSButton implements Button{

    @Override
    public void render(){
        System.out.println("Rendering MacOS button");
    }
}
class MacOSScrollBar implements ScrollBar{

    @Override
    public void scroll(){
        System.out.println("Scrolling MacOs scrollbar");
    }
}

interface UIFactory {
    Button createButton();
    ScrollBar createScrollBar();
}

class WindowsFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }

}

class MacOsFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacOSScrollBar();
    }

}

public class Application {
    private Button button;
    private ScrollBar scrollBar;

    public Application(UIFactory factory){
        this.button = factory.createButton();
        this.scrollBar = factory.createScrollBar();
    }

    public void renderUI(){
        button.render();
        scrollBar.scroll();
    }

    public static void main(String[] args) {
        Application app = new Application(new WindowsFactory());
        app.renderUI();
    }
}
