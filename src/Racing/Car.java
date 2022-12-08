package Racing;

import java.util.ArrayList;

public class Car extends Transport implements Competing {
    private int maxSpeed;
    private double bestLap;
    private final BodyType bodyType ;








    public Car(String brand, String model, double engineVolume,BodyType bodyType ) {
        super(brand, model, engineVolume);
        this.bodyType=bodyType;


    }


    public BodyType getBodyType() {
        return bodyType;
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
        if (bodyType == null) {
            System.out.println("Данных не достаточно");
        } else {
            System.out.println("Кузов " + bodyType.getCarType());
        }
    }

    @Override
    public boolean getDiagnosed() {
return Math.random()>0.7;
    }

    @Override
    public void repair() {
        System.out.println("Машина "+getBrand()+ getModel()+" починина" );
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

        return "Racing.Car{" +
                "maxSpeed=" + maxSpeed +
                ", bestLap=" + bestLap + super.toString()  ;

    }
}


