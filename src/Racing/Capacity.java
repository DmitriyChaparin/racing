package Racing;

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

    public Integer getFrom() {
        return from;
    }

    public Integer getTo() {
        return to;
    }

    @Override
    public String toString() {
        if (from == null) {
            return "Вместительность до " + to + "человек";
        }
        return "Вместительность от " + from + ", до " + to + " человек";
    }
}

