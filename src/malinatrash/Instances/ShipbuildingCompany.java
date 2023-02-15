package malinatrash.Instances;

public class ShipbuildingCompany extends Organization {

    public ShipbuildingCompany(String name) {
        super(name);
    }

    public String getShip() {
        return getObjetName();
    }

    @Override
    public String processOperation() {
        return("Судостроительная компания под названием " + getName() + " построила новое судно с названием: " +  getShip());
    }
}
