package Racing;

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

}

