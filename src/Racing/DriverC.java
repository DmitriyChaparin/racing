package Racing;

public class DriverC<T extends Truck> extends Driver {
    public DriverC(String fullName, String driverLicense, Integer experience) {
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
        if (getDriverLicense().equals("C")) {
            System.out.println("Водитель " + getFullName() + " управляет " + car.getBrand() + " " + car.getModel() + " будет участвовать в заезде");

        } else { System.out.println("Водитель " + getFullName() +  " не будет участвовать в заезде,водительское удостоверение не той категории");



        }

    }
}


