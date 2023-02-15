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

    public static StringBuilder doAllActivities() {
        StringBuilder message = new StringBuilder();
        if (companies.isEmpty()) {
            return new StringBuilder(("Для этого добавьте хотя бы одну компанию..."));
        }
        System.out.println();
        for (Organization company: companies) {
            message.append(company.processOperation());
        }
        message.append("\n");
        return message;
    }

    public static void getCompaniesList() {
        System.out.println();
        for (int i = 0; i < companies.size(); i++) {
            System.out.println((i + 1) + " - " + companies.get(i).getName());
        }
        System.out.println();
    }
}
