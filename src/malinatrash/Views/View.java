package malinatrash.Views;

import javax.swing.*;
import java.awt.*;

interface IView {
    void viewDidLoad();
}

public class View extends JFrame implements IView {
    View(int width, int height, String title) {
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight =  Toolkit.getDefaultToolkit().getScreenSize().height;
        setBounds((screenWidth - width) / 2, (screenHeight - height) / 2, width, height);
        setVisible(true);
        viewDidLoad();
    }
    @Override
    public void viewDidLoad() {
    }
}
