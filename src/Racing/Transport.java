package Racing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;
    private final List<Driver> drivers = new ArrayList<>();
    private final List<Mechanic> mechanics = new ArrayList<>();
    private final List<Sponsors> sponsors = new ArrayList<>();

    public final String getBrand() {
        return brand;
    }

    public final String getModel() {
        return model;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public List<Sponsors> getSponsors() {
        return sponsors;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {

        this.engineVolume = engineVolume;

    }


    public Transport(String brand, String model, double engineVolume) {
        this.brand = validateString(brand);
        this.model = validateString(model);
        this.engineVolume = engineVolume;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void printType();

    public static String validateString(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "Введите данные" : value;
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    } public void addMechanic(Mechanic... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    } public void addSponsors(Sponsors... sponsor) {
        this.sponsors.addAll(Arrays.asList(sponsor));
    }
    public abstract boolean getDiagnosed();

    public abstract void repair();

    @Override
    public String toString() {
        return "Racing.Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

}
