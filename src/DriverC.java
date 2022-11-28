public class DriverC<T extends Truck> extends Driver {
    public DriverC(String fullName, boolean driverLicense, Integer experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    String startMoving() {
        return getFullName() + " начал гонку";
    }

    @Override
    String stopMoving() {
        return getFullName() + " закончил гонку";
    }

    @Override
    String refuelCar() {
        return getFullName() + " заправляет авто";
    }

    public void getCanRace(T car) {
        if (getDriverLicense()) {
            System.out.println("Водитель " + getFullName() + " управляет " + car.getBrand() + " " + car.getModel() + " будет участвовать в заезде");

        } else { System.out.println("Водитель " + getFullName() +  " не будет участвовать в заезде, нет водительского удостоверения");



        }

    }
}


