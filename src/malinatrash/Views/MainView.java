package malinatrash.Views;

import malinatrash.Model.State;

import javax.swing.*;
import java.awt.*;

public class MainView extends View {
    AllActivitiesView allActivitiesView = new AllActivitiesView(600, 200, "Все активности");
    AddCompanyView addCompanyView = new AddCompanyView(500, 130, "Добавить компанию");
    FindCompanyView findCompanyView = new FindCompanyView(500, 100, "Найти компанию");
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
        doAllActivitiesButton.addActionListener(e -> {
            allActivitiesView.updateData(State.doAllActivities());
            allActivitiesView.setVisible(true);
        });

        JButton allCompaniesButton = new JButton("Посмотреть список всех компаний");
        buttonsPanel.add(allCompaniesButton);
        allCompaniesButton.addActionListener(e -> {
            allActivitiesView.updateData(State.getCompaniesList());
            allActivitiesView.setVisible(true);
        });
    }
}
