package Racing;

public class Truck extends Transport implements Competing {
    private int maxSpeed;
    private double bestLap;
    private Carrying carrying;


    public Truck(String brand, String model, double engineVolume,Carrying carrying) {
        super(brand, model, engineVolume);
        this.carrying = carrying;
    }

    public Carrying getCarrying() {
        return carrying;
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
        if (carrying == null) {
            System.out.println("Данных не достаточно");
        } else {
            System.out.println(carrying.toString());
        }
    }

    @Override
    public boolean getDiagnosed() {
        return Math.random()>0.8;
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
