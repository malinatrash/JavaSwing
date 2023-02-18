package malinatrash.App;

import malinatrash.ConsoleInterface.Menu;
import malinatrash.Views.MainView;

public class Main {

    public static void main(String[] args) {
        MainView view = new MainView(350, 140, "JavaSwing");
        view.invalidate();
        view.validate();
        view.repaint();
        Menu.start();
    }
}
