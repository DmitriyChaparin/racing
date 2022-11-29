public class Truck extends Transport implements Competing {
    private int maxSpeed;
    private double bestLap;

    public enum Carrying {
        N_1(3.5f), N_2(3.5f, 12f), N_3(12f, 0);

        private float lower;
        private float upper;

        Carrying(float upper) {
            this.upper = upper;
        }

        Carrying(float lower, float upper) {
            this.lower = lower;
            this.upper = upper;
        }

        @Override
        public String toString() {
            if (lower == 0.0f) {
                return "Грузоподъемность до " + upper + " тонн.";
            } else if (upper == 0.0f) {
                return "Грузоподъемность свыше " + lower + " тонн.";
            }
            return "Грузоподъемность: " + "от " + lower + ", до " + upper + " тонн.";
        }
    }

    public Truck(String brand, String model, double engineVolume) {
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
