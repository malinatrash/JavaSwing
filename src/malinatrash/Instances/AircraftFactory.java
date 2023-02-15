package malinatrash.Instances;

public class AircraftFactory extends Organization {

    public AircraftFactory(String name) {
        super(name);
    }

    private String craftAirPlane() {
        return getObjetName();
    }

    @Override
    public String processOperation() {
        return ("Авиазавод под названием " + getName() + " построил новый самолет под названием " + craftAirPlane());
    }
}
