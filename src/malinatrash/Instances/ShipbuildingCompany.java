package malinatrash.Instances;

public class ShipbuildingCompany extends Organization {

    public ShipbuildingCompany(String name) {
        super(name);
        setType("Судостроительная компания");
    }

    public String getShip() {
        return getObjetName();
    }

    @Override
    public String processOperation() {
        return(getType() + " под названием " + getName() + " построила новое судно с названием: " +  getShip());
    }
}
