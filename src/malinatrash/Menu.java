package malinatrash;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Organization> companies = new ArrayList<Organization>();

    public static void start() {
        getMainMenu();
    }

    private static void getMainMenu() {
        boolean working = true;
        do {
            System.out.println("\nДобро пожаловать в программу!");
            System.out.println("1 - Создать организацию");
            System.out.println("2 - Посмотреть список компаний");
            System.out.println("3 - Выполнить действия всех компаний");
            System.out.println("4 - Выполнить действие конкретной компании");
            System.out.println("0 - Выход из программы\n");

            int choice = readChoice();

            switch (choice) {
                case 1:
                    createCompany();
                    break;
                case 2:
                    getCompaniesList();
                    break;
                case 3:
                    doAllActivities();
                    break;
                case 4:
                    doSelectedActivity();
                    break;
                case 0:
                    working = false;
                    System.out.println("Выход из программы...");
            }
        } while (working);
    }

    private static void doSelectedActivity() {
        System.out.print("Введите название компании, действие которой вы хотите посмотреть: ");
        String title = scanner.nextLine();

        for (Organization company: companies) {
            if (company.getName() == null ? title == null : company.getName().equals(title)) {
                company.processOperation();
                return;
            }
        }
        System.out.println("Компании с выбранным именем не существует!");
    }

    private static void doAllActivities() {
        if (companies.isEmpty()) {
            System.out.println("Для этого добавьте хотя бы одну компанию...");
            return;
        }
        System.out.println();
        for (Organization company: companies) {
            company.processOperation();
        }
        System.out.println();
    }

    private static void getCompaniesList() {
        System.out.println();
        for (int i = 0; i < companies.size(); i++) {
            System.out.println((i + 1) + " - " + companies.get(i).getName());
        }
        System.out.println();
    }

    private static void createCompany() {
        System.out.println("1 - Страховая компания");
        System.out.println("2 - Судостроительная компания");
        System.out.println("3 - Авиастроительная компания");
        System.out.print("Какую компанию вы хотите создать: ");

        int choice = readChoice();
        switch (choice) {
            case 1:
                System.out.print("Введите название компании: ");
                companies.add(new InsuranceCompany(scanner.nextLine()));
                return;
            case 2:
                System.out.print("Введите название компании: ");
                companies.add(new ShipbuildingCompany(scanner.nextLine()));
                return;
            case 3:
                System.out.print("Введите название компании: ");
                companies.add(new AircraftFactory(scanner.nextLine()));
                return;
            default:
                createCompany();
        }
    }


    private static int readChoice() {
        Scanner in = new Scanner(System.in);
        int readed;
        try {
            readed = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Ошибка! Допустим только ввод значений пунктов меню");
            readed = readChoice();
        }
        return readed;
    }

}
