package malinatrash.Model;

import malinatrash.Instances.Organization;

import java.util.ArrayList;

public class State {

    public static final ArrayList<Organization> companies = new ArrayList<>();

    public static void deleteSelectedCompany(String name) {
        for (Organization company: companies) {
            if (company.getName() == null ? name == null : company.getName().equals(name)) {
                companies.remove(company);
                System.out.println("Успешно удалено!");
                return;
            }
        }
        System.out.println("Компании с выбранным именем не существует!");
    }

    public static String doSelectedActivity(String name) {

        for (Organization company: companies) {
            if (company.getName() == null ? name == null : company.getName().equals(name)) {
                return company.processOperation();
            }
        }
        return ("Компании с выбранным именем не существует!");
    }

    public static String doAllActivities() {
        StringBuilder message = new StringBuilder();
        if (companies.isEmpty()) {
            return ("Для этого добавьте хотя бы одну компанию...");
        }
        System.out.println();
        for (Organization company: companies) {
            message.append(company.processOperation());
            message.append("\n");
        }
        return message.toString();
    }

    public static String getCompaniesList() {
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < companies.size(); i++) {
            message.append(i + 1).append(" - ").append(companies.get(i).getName());
            message.append("\n");
        }
        return message.toString();
    }
}
