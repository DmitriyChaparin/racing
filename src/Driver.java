import java.util.Objects;

public  abstract class Driver {
    private final String fullName;
    private final boolean driverLicense;
    private Integer experience;


    public String getFullName() {
        return fullName;
    }

    public boolean getDriverLicense() {
        return driverLicense;
    }

    public double getExperience() {
        return experience;
    }

//    public void setDriverLicense(String driverLicense) {
//        if ( driverLicense.equals("B") || driverLicense.equals("C") || driverLicense.equals("D")) {
//            this.driverLicense = driverLicense;
//        } else {
//            this.driverLicense ="Не правильно указана категория водительского удостоверения";
//        }
//    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Driver(String fullName, boolean driverLicense, Integer experience) {
        this.fullName = fullName;
        this.driverLicense=driverLicense;
        this.experience = experience;
    }
    abstract String startMoving();

    abstract String stopMoving();
    abstract String refuelCar();

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", driverLicense=" + driverLicense +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && Objects.equals(fullName, driver.fullName) && Objects.equals(experience, driver.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, experience);
    }
}
