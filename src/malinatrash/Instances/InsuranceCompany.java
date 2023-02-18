package malinatrash.Instances;

public class InsuranceCompany extends Organization {

    public InsuranceCompany(String name) {
        super(name);
        setType("Страховая компания");
    }

    private String insuranceHuman() {
        return getObjetName();
    }

    @Override
    public String processOperation() {
        return (getType() + " под названием " + getName() + " застраховала человека с ID: " + insuranceHuman());
    }
}
