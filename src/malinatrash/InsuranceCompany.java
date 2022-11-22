package malinatrash;

public class InsuranceCompany extends Organization {

    public InsuranceCompany(String name) {
        super(name);
    }

    private String insuranceHuman() {
        return getObjetName();
    }

    @Override
    public void processOperation() {
        System.out.println("Страховая компания под названием " + getName() + " застраховала человека с ID: " + insuranceHuman());
    }
}
