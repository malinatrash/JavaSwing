package malinatrash.Views;

import malinatrash.Instances.AircraftFactory;
import malinatrash.Instances.InsuranceCompany;
import malinatrash.Instances.ShipbuildingCompany;

import malinatrash.Model.State;

import javax.swing.*;

public class AddCompanyView extends View {
    private boolean isAircraft = false;
    private boolean isInsurance = false;
    private boolean isShipbuilding = false;
    AddCompanyView(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();
        setVisible(false);
        JPanel panel = new JPanel();
        add(panel);
        addRadioButtons(panel);
        JTextField companyName = new JTextField(35);
        panel.add(companyName);
        addButton(panel, companyName);
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
    private JTextField getTextField() {
        return new JTextField(35);
    }
    private void addButton(JPanel panel, JTextField button) {
        JButton addButton = new JButton("Добавить");
        addButton.addActionListener(e -> {
            if (isInsurance) {
                State.companies.add(new InsuranceCompany(button.getText()));
            } else if (isAircraft) {
                State.companies.add(new AircraftFactory(button.getText()));
            } else if (isShipbuilding) {
                State.companies.add(new ShipbuildingCompany(button.getText()));
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
