package malinatrash.Views;

import malinatrash.Model.State;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class FindCompanyView extends JFrame {
    JTextField companyName = new JTextField(35);
    FindCompanyView() {
        setTitle("Поиск компании");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = 500;
        int height = 150;
        setBounds((screenWidth - width) / 2, (screenHeight - height) / 2, width, height);
        setVisible(false);
        setupLayout();
    }
    private void setupLayout() {
        JPanel panel = new JPanel();
        add(panel);
        addTextField(panel);
        addButton(panel);
    }

    private void addTextField(JPanel panel) {
        panel.add(companyName);
    }
    private void addButton(JPanel panel) {
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
            showMessageDialog(null, "Успешно");
        });
        panel.add(deleteButton);
    }
}