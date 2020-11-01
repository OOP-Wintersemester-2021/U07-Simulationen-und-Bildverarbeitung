import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Label;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class HelloWorld extends GraphicsApp {

    private Label helloWorldLabel;

    @Override
    public void initialize() {
        setCanvasSize(500,500);
        helloWorldLabel = new Label(50,50,"Hello World!", Colors.WHITE);
    }

    @Override
    public void draw() {
        drawBackground(Colors.BLACK);
        helloWorldLabel.draw();
    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch("HelloWorld");
    }
}
