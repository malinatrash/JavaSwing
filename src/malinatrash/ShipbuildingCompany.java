package malinatrash;

public class ShipbuildingCompany extends Organization {

    public ShipbuildingCompany(String name) {
        super(name);
    }

    public String getShip() {
        return getObjetName();
    }

    @Override
    public void processOperation() {
        System.out.println("Судостроительная компания под названием " + getName() + " построила новое судно с названием: " +  getShip());
    }
}
