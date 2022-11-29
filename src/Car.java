public class Car extends Transport implements Competing {
    private int maxSpeed;
    private double bestLap;

    public enum BodyType {
        SEDAN("Седан"), HATCHBACK("Хетчбек"), COUPE("Купе"), WAGON("Универсал"), SUV("Внедорожник"),
        CUV("Кроссовер"), PICK_UP("Пикап"), VAN("Фургон"), MINIVAN("Минивэн");
        private final String title;

        BodyType(String title) {
            this.title = title;
         }

        @Override
        public String toString() {
            return "Тип кузова - " + title ;
        }
    }


    public Car(String brand, String model, double engineVolume) {
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
