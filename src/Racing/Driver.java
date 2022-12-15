package Racing;

import java.util.ArrayList;

public  abstract class Driver {
    private final String fullName;
    private  String driverLicense;
    private Integer experience;




    public String getFullName() {
        return fullName;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public double getExperience() {
        return experience;
    }

    public void setDriverLicense(String driverLicense) {
        if ( driverLicense.equals("B") || driverLicense.equals("C") || driverLicense.equals("D")) {
            this.driverLicense = driverLicense;
        } else {
            throw new IllegalArgumentException("Не правильно указана категория водительского удостоверения");
        }
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Driver(String fullName, String driverLicense, Integer experience) {
        this.fullName = fullName;
      setDriverLicense(driverLicense);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Водитель:" +
                 fullName + '\'' +
                ", лицензия: " + driverLicense + '\'' +
                ", опыт:" + experience;
    }

    abstract String startMoving();

    abstract String stopMoving();
    abstract String refuelCar();
}
