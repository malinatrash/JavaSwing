package malinatrash.Views;

import javax.swing.*;
import java.awt.*;

public class MainView extends View {
//    AllActivitiesView allActivitiesView = new AllActivitiesView();
    AddCompanyView addCompanyView = new AddCompanyView(500, 120, "Добавить компанию");
    FindCompanyView findCompanyView = new FindCompanyView(500, 120, "Найти компанию");
    public MainView(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();
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
