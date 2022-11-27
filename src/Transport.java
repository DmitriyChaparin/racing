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
        this.brand = brand;
        this.model = model;
        this.engineVolume=engineVolume;
    }

//    public abstract void refill();


}
