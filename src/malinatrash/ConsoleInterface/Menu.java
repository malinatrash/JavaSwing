package malinatrash.ConsoleInterface;

import java.util.Scanner;

public class Menu {

//    private static final Scanner scanner = new Scanner(System.in);

//    State state = new State();

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
            System.out.println("5 - Удалить компанию по имени");
            System.out.println("0 - Выход из программы\n");

            int choice = readChoice();
//            String title;

            switch (choice) {
                case 1:
                    createCompany();
                    break;
                case 2:
//                    state.getCompaniesList();
                    break;
                case 3:
//                    state.doAllActivities();
                    break;
                case 4:
                    System.out.print("Введите название компании, действие которой вы хотите посмотреть: ");
//                    title = scanner.nextLine();
//                    state.doSelectedActivity(title);
                    break;
                case 5:
                    System.out.print("Введите название компании, которую вы хотите удалить: ");
//                    title = scanner.nextLine();
//                    state.deleteSelectedCompany(title);
                    break;
                case 0:
                    working = false;
                    System.out.println("Выход из программы...");
            }
        } while (working);
    }

    private static void createCompany() {
        System.out.println("1 - Страховая компания");
        System.out.println("2 - Судостроительная компания");
        System.out.println("3 - Авиастроительная компания");
        System.out.print("Какую компанию вы хотите создать: ");

        int choice = Menu.readChoice();
        switch (choice) {
            case 1:
            case 2:
//                state.companies.add(new ShipbuildingCompany(scanner.nextLine()));
            case 3:
                System.out.print("Введите название компании: ");
//                state.companies.add(new InsuranceCompany(scanner.nextLine()));
                return;
//                state.companies.add(new AircraftFactory(scanner.nextLine()));
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
