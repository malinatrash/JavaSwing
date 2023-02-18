package malinatrash.Instances;

public class AircraftFactory extends Organization {

    public AircraftFactory(String name) {
        super(name);
        setType("Авиазавод");
    }
    @Override
    public String processOperation() {
        return (getType() + " под названием " + getName() + " построил новый самолет под названием " + craftAirPlane());
    }
    private String craftAirPlane() {
        return getObjetName();
    }
}
