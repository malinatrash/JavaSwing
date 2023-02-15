package malinatrash.Views;

import malinatrash.Instances.AircraftFactory;
import malinatrash.Instances.InsuranceCompany;
import malinatrash.Instances.ShipbuildingCompany;
import malinatrash.Model.State;

import javax.swing.*;
import java.awt.*;

public class AddCompanyView extends JFrame {
    JTextField companyName = new JTextField(35);
    private boolean isAircraft = false;
    private boolean isInsurance = false;
    private boolean isShipbuilding = false;
    AddCompanyView() {
        setTitle("Добавление компании");
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

        addRadioButtons(panel);
        addTextField(panel);
        addButton(panel);

        companyName.setEditable(isOnlyOne());
    }
    private void addRadioButtons(JPanel panel) {
        JRadioButton isAircraft = new JRadioButton("Авиастроительная");
        JRadioButton isInsurance = new JRadioButton("Страховая");
        JRadioButton isShipbuilding = new JRadioButton("Судостроительная");

        isAircraft.addActionListener(e -> {
            chooseAircraft();
            if (!isOnlyOne()) {
                this.isShipbuilding = false;
                isShipbuilding.setSelected(false);
                this.isInsurance = false;
                isInsurance.setSelected(false);
            }
        });
        isShipbuilding.addActionListener(e -> {
            chooseShipbuilding();
            if (!isOnlyOne()) {
                this.isAircraft = false;
                isAircraft.setSelected(false);
                this.isInsurance = false;
                isInsurance.setSelected(false);
            }
        });
        isInsurance.addActionListener(e -> {
            chooseInsurance();
            if (!isOnlyOne()) {
                this.isShipbuilding = false;
                isShipbuilding.setSelected(false);
                this.isAircraft = false;
                isAircraft.setSelected(false);
            }
        });

        panel.add(isInsurance);
        panel.add(isAircraft);
        panel.add(isShipbuilding);
    }
    private void addTextField(JPanel panel) {
//        companyName.
        panel.add(companyName);
    }
    private void addButton(JPanel panel) {
        JButton addButton = new JButton("Добавить");
        addButton.addActionListener(e -> {
            if (isInsurance) {
                State.companies.add(new InsuranceCompany(companyName.getText()));
            } else if (isAircraft) {
                State.companies.add(new AircraftFactory(companyName.getText()));
            } else if (isShipbuilding) {
                State.companies.add(new ShipbuildingCompany(companyName.getText()));
            }
            setVisible(false);
            State.getCompaniesList();
        });
        panel.add(addButton);
    }
    private boolean isOnlyOne() {
        int count = 0;
        if (isAircraft) {
            count++;
        } if (isInsurance) {
            count++;
        } if (isShipbuilding) {
            count++;
        }
        if (count == 1) {
            companyName.setEditable(true);
            return true;
        }
        return false;
    }

    private void chooseAircraft() {
        isAircraft = true;
    }
    private void chooseInsurance() {
        isInsurance = true;
    }
    private void chooseShipbuilding() {
        isShipbuilding = true;
    }
}
