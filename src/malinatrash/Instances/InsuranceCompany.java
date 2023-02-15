package malinatrash.Instances;

public class InsuranceCompany extends Organization {

    public InsuranceCompany(String name) {
        super(name);
    }

    private String insuranceHuman() {
        return getObjetName();
    }

    @Override
    public String processOperation() {
        return ("Страховая компания под названием " + getName() + " застраховала человека с ID: " + insuranceHuman());
    }
}
