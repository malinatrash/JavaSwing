package malinatrash;

public class AircraftFactory extends Organization {

    public AircraftFactory(String name) {
        super(name);
    }

    private String craftAirPlane() {
        return getObjetName();
    }

    @Override
    public void processOperation() {
        System.out.println("Авиазавод под названием " + getName() + " построил новый самолет под названием " + craftAirPlane());
    }
}
