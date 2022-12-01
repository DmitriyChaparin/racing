public class Car extends Transport implements Competing {
    private int maxSpeed;
    private double bestLap;

    public enum BodyType {
        SEDAN("Седан"), HATCHBACK("Хетчбек"),
        COUPE("Купе"), WAGON("Универсал"),
        SUV("Внедорожник"), CUV("Кроссовер"),
        PICK_UP("Пикап"), VAN("Фургон"),
        MINIVAN("Минивэн");


        private final String carType;

        BodyType(String carType) {
            this.carType = carType;
        }

        public String getCarType() {
            return carType;
        }

        @Override
        public String toString() {
            return "BodyType{" +
                    "carType='" + carType + '\'' +
                    '}';
        }
        public String r =getCarType();
    }


    public Car(String brand, String model, double engineVolume,BodyType bodyType) {
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

    public void typeOfCar(String type) {
        BodyType bodyType = BodyType.valueOf(type);

        switch (bodyType) {
            case SEDAN:
                System.out.println("c");
                break;
            case HATCHBACK:
                System.out.println("2");
                break;
            case COUPE:
                System.out.println("3");
                break;
            case WAGON:
                System.out.println("4");
                break;
            case SUV:
                System.out.println("5");
                break;
            case CUV:
                System.out.println("6");
                break;
            case PICK_UP:
                System.out.println("7");
                break;
            case VAN:
                System.out.println("8");
                break;
            case MINIVAN:
                System.out.println("9");
                break;
        }
    }

    @Override
    public String toString() {

        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", bestLap=" + bestLap + super.toString() ;

    }
}


