public class Bus extends Transport implements Competing{
    private int maxSpeed;
    private double bestLap;

    public enum Capacity{

    }
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("машина поехала");

    }

    @Override
    public void stopMoving() {
        System.out.println("машина остановилась");
    }

    @Override
    public String pitStop() {
        return "пора на пит-стоп";
    }

    @Override
    public void getBestLap() {
        System.out.println("Лучший круг " + bestLap);
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость " + maxSpeed);
    }
}
