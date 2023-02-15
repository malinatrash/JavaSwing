package malinatrash.GUI.ViewControllers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ViewController extends JFrame {

    int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
    int screenHeight =  Toolkit.getDefaultToolkit().getScreenSize().height;

    int width = 800;
    int height = 600;
    public ViewController() {
        setUpView();
    }
    private void setUpView() {
        setTitle("JavaSwing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds((screenWidth - width) / 2, (screenHeight - height) / 2, width, height);
        setVisible(true);
        JPanel jpan = new JPanel();
        add(jpan);

    }
    private void addWindowListener() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
    }
}
