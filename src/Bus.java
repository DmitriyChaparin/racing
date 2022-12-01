public class Bus extends Transport implements Competing {
    private int maxSpeed;
    private double bestLap;

    public enum Capacity {
        VERY_SMALL(10), SMALL(25), AVERAGE(40, 50), LARGE(60, 80), VERY_LARGE(100, 120);
        Integer from;
        Integer to;

        Capacity(Integer to) {
            this.to = to;
        }

        Capacity(Integer from, Integer to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String toString() {
            if (from == null) {
                return "Вместительность до " + to;
            }
                return "Вместительность от " + from + ", до " + to;
            }
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
