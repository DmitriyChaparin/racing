import java.util.Objects;

public class Bus extends Transport implements Competing {
    private int maxSpeed;
    private double bestLap;

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

    @Override
    public String toString() {
        return super.toString() + " " + "Bus{" +
                "maxSpeed=" + maxSpeed +
                ", bestLap=" + bestLap +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return maxSpeed == bus.maxSpeed && Double.compare(bus.bestLap, bestLap) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed, bestLap);
    }
}
