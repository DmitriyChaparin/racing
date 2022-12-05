package Racing;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;

    public final String getBrand() {
        return brand;
    }

    public final String getModel() {
        return model;
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
    public abstract boolean getDiagnosed();

    @Override
    public String toString() {
        return "Racing.Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
