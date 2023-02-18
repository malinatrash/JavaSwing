package malinatrash.Views;

import malinatrash.Model.State;
import malinatrash.Model.TabelModelData;

import javax.swing.*;
import java.awt.*;

public class AllActivitiesView extends View {
    AllActivitiesView(int width, int height, String title) {
        super(width, height, title);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    public void getAllCompanies(State state) {
        createTable(state, "Companies");
    }
    public void getAllActivities(State state) {
        createTable(state, "Activities");
    }
    private void createTable(State state, String type) {
        JTable table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(480, 300));
        if (type.equals("Companies")) {
            table.setModel(new TabelModelData(state, type));
        }
        table.setModel(new TabelModelData(state, type));
        add(table);
    }
}
