package malinatrash.Views;

import malinatrash.Model.State;

import javax.swing.*;
import java.awt.*;

public class RootView extends JFrame {
//    AllActivitiesView allActivitiesView = new AllActivitiesView();
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

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(buttonsPanel);

        JButton addButton = new JButton("Добавить");
        buttonsPanel.add(addButton);
        addButton.addActionListener(e -> addCompanyView.setVisible(true));

        JButton findButton = new JButton("Найти");
        buttonsPanel.add(findButton);
        findButton.addActionListener(e -> findCompanyView.setVisible(true));

        JButton doAllActivitiesButton = new JButton("Посмотреть активности всех компаний");
        buttonsPanel.add(doAllActivitiesButton);
//        doAllActivitiesButton.addActionListener(e -> {
//            allActivitiesView.setText(State.doAllActivities());
//            allActivitiesView.setVisible(true);
//        });

    }

    private void addTable() {

    }
}
