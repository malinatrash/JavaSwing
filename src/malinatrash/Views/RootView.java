package malinatrash.Views;

import javax.swing.*;
import java.awt.*;

public class RootView extends JFrame {
    AddCompanyView addCompanyView = new AddCompanyView();
    FindCompanyView findCompanyView = new FindCompanyView();
    public RootView() {
        setUpView();
    }
    private void setUpView() {
        setTitle("JavaSwing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight =  Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = 800;
        int height = 600;
        setBounds((screenWidth - width) / 2, (screenHeight - height) / 2, width, height);
        setVisible(true);

        JPanel jpan = new JPanel();
        add(jpan);

        JButton b = new JButton("Добавить");
        jpan.add(b);
        b.addActionListener(e -> addCompanyView.setVisible(true));
        JButton b2 = new JButton("Найти");
        jpan.add(b2);
        b2.addActionListener(e -> findCompanyView.setVisible(true));

    }
}
