package malinatrash.Views;

import malinatrash.Model.State;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class FindCompanyView extends View {
    FindCompanyView(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();
        JPanel panel = new JPanel();
        add(panel);
        JTextField companyName = new JTextField(35);
        panel.add(companyName);
        addButton(panel, companyName);
    }
    private void addButton(JPanel panel, JTextField companyName) {
        JButton findButton = new JButton("Выполнить действие");
        findButton.addActionListener(e -> {
            setVisible(false);
            showMessageDialog(null, State.doSelectedActivity(companyName.getText()));
        });
        panel.add(findButton);

        JButton deleteButton = new JButton("Удалить");
        deleteButton.addActionListener(e -> {
            State.deleteSelectedCompany(companyName.getText());
            setVisible(false);
        });
        panel.add(deleteButton);
    }
}