package malinatrash.Views;

import malinatrash.Model.State;

import javax.swing.*;
import java.awt.*;

public class MainView extends View {
    State state = new State();
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

        addButton.addActionListener(e -> createAddCompanyView());

        JButton findButton = new JButton("Найти");
        buttonsPanel.add(findButton);
        findButton.addActionListener(e -> createFindCompanyView());

        JButton doAllActivitiesButton = new JButton("Посмотреть активности всех компаний");
        buttonsPanel.add(doAllActivitiesButton);
        doAllActivitiesButton.addActionListener(e -> getAllActivities());

        JButton allCompaniesButton = new JButton("Посмотреть список всех компаний");
        buttonsPanel.add(allCompaniesButton);
        allCompaniesButton.addActionListener(e -> getAllCompanies());
    }
    private void createAddCompanyView() {
        AddCompanyView addCompanyView = new AddCompanyView(500, 130, "Добавить компанию");
        addCompanyView.state = this.state;
    }
    private void createFindCompanyView() {
        FindCompanyView findCompanyView = new FindCompanyView(500, 100, "Найти компанию");
        findCompanyView.state = this.state;
    }
    private void getAllActivities() {
        AllActivitiesView allActivitiesView = new AllActivitiesView(700, 300, "Все активности");
        allActivitiesView.getAllActivities(state);
    }
    private void getAllCompanies() {
        AllActivitiesView allActivitiesView = new AllActivitiesView(570, 200, "Все активности");
        allActivitiesView.getAllCompanies(state);
    }
}
