package malinatrash.Model;

import malinatrash.Instances.Organization;

import java.util.ArrayList;

public class State {
    private final ArrayList<Organization> organizations = new ArrayList<>();
    public int getSize() {
        return organizations.size();
    }
    public Organization getOrganization(int index) {
        return organizations.get(index);
    }

    public void deleteSelectedCompany(String name) {
        for (Organization company: organizations) {
            if (company.getName() == null ? name == null : company.getName().equals(name)) {
                organizations.remove(company);
                System.out.println("Успешно удалено!");
                return;
            }
        }
        System.out.println("Компании с выбранным именем не существует!");
    }
    public String doSelectedActivity(String name) {
        for (Organization company: organizations) {
            if (company.getName() == null ? name == null : company.getName().equals(name)) {
                return company.processOperation();
            }
        }
        return ("Компании с выбранным именем не существует!");
    }
    public void addOrganization(Organization organization) {
        organizations.add(organization);
    }
}
