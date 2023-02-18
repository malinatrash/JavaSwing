package malinatrash.Views;

import malinatrash.Model.State;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class FindCompanyView extends View {
    State state;
    FindCompanyView(int width, int height, String title) {
        super(width, height, title);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
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
            showMessageDialog(null, state.doSelectedActivity(companyName.getText()));
        });
        panel.add(findButton);

        JButton deleteButton = new JButton("Удалить");
        deleteButton.addActionListener(e -> {
            state.deleteSelectedCompany(companyName.getText());
            setVisible(false);
        });
        panel.add(deleteButton);
    }
}