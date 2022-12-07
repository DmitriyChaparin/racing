package Racing;

public class Mechanic<T extends Transport> {
    private final String nameAndLastName;
    private final String company;

    public Mechanic(String nameAndLastName, String company) {
        this.nameAndLastName = nameAndLastName;
        this.company = company;
    }

    public String getNameAndLastName() {
        return nameAndLastName;
    }

    public String getCompany() {
        return company;
    }

    public void fixTheCar(T t) {
        System.out.println("Машина " + t.getBrand() + " " + t.getModel() + " отремонтирована");
    }

    public void carryOutMaintenance(T t) {
        if (t.getDiagnosed()) {
            System.out.println(t.getDiagnosed());
        } else {
            fixTheCar(t);
        }
    }

    @Override
    public String toString() {
        return nameAndLastName + ", из компании: " + company ;
    }
}
