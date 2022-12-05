package Racing;

public class Bus extends Transport implements Competing {
    private int maxSpeed;
    private double bestLap;
    private Capacity capacity;



    public Bus(String brand, String model, double engineVolume,Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity=capacity;
    }

    public Capacity getCapacity() {
        return capacity;
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
    public void printType() {
        if (capacity == null) {
            System.out.println("Нет данных");
        } else {
            System.out.println(capacity.toString());
        }

    }

    @Override
    public boolean getDiagnosed() {
        System.out.println(getBrand()+" в диагностики не нуждается!");
        return true;
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
