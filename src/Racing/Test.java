package Racing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Car audi = new Racing.Car("Audi", "A4RS", 3.0, BodyType.CUV);
        Car bmw = new Racing.Car("BMW", "325M", 2.5, BodyType.WAGON);
        Car porsche = new Racing.Car("Porsche", "911", 2.6, BodyType.HATCHBACK);
        Car lada = new Car("Lada", "Vesta", 1.8, BodyType.COUPE);

        Truck kamaz = new Truck("Kamaz", "5540", 12, Carrying.N_2);
        Truck maz = new Truck("MAZ", "5566", 11.5, Carrying.N_1);
        Truck scania = new Truck("Scania", "R500", 10.3, Carrying.N_1);
        Truck volvo = new Truck("Volvo", "RS300", 15, Carrying.N_3);

        Bus paz = new Bus("PAZ", "T132", 10, Capacity.SMALL);
        Bus liaz = new Bus("Liaz", "Speed77", 11.8, Capacity.LARGE);
        Bus gaz = new Bus("GAZ", "G879", 9.5, Capacity.VERY_SMALL);
        Bus volgabus = new Bus("Volgabus", "14U0", 14, Capacity.LARGE);

        DriverB<Car> vova = new DriverB<>("Автомобилов Владимир Иномаркович", "B", 11);
        DriverB<Car> misha = new DriverB<>("Улиткин Михаил Петрович", "B", 11);
        DriverB<Car> anna = new DriverB<>("Покрышкина Анна Ивановна", "B", 11);

        DriverC<Racing.Truck> albert = new Racing.DriverC<>("Камазов Альберт Колёсович", "D", 2);
        DriverC<Racing.Truck> vlad = new Racing.DriverC<>("Гоншиков Владислав Кириллович", "D", 2);
        DriverD<Racing.Bus> nina = new Racing.DriverD<>("Пазикова Нина Сергеевна", "D", 0);

        Set<Driver> drivers = new HashSet<>();
        drivers.add(misha);
        drivers.add(anna);
        drivers.add(vlad);
        drivers.add(nina);
        drivers.add(nina);
        drivers.add(vova);
        System.out.println(drivers);

        Mechanic<Car> gena = new Mechanic<>("Гайкин Генадий", "MSI");
        Mechanic<Car> kolia = new Mechanic<>("Колёсов Николай", "USB");
        Mechanic<Car> lena = new Mechanic<>("Шурупова Елена", "CNN");

        Set<Mechanic>mechanics = new HashSet<>();
        mechanics.add(gena);
        mechanics.add(kolia);
        mechanics.add(lena);
        System.out.println(mechanics);


        Sponsors tatneft = new Sponsors("ТатНефть", 3000000);
        Sponsors azot = new Sponsors("ТольяттиАзот", 1500000);
        Sponsors michelin = new Sponsors("Michelin", 8000000);

        audi.addDriver(vova);
        audi.addMechanic(gena, lena);
        audi.addSponsors(azot, michelin);

        volvo.addDriver(albert);
        volvo.addMechanic(kolia);
        volvo.addSponsors(tatneft);

        paz.addDriver(nina);
        paz.addMechanic(lena);
        paz.addSponsors(michelin);


      Set<Transport> transports = new HashSet<> ();
        transports.add(audi);
        transports.add(bmw);
        transports.add(kamaz);
        transports.add(porsche);
        transports.add(paz);
        System.out.println(transports);

        //  getDiagnosed(audi, bmw, porsche, lada,
// paz, liaz, gaz, volgabus,
//  kamaz, maz, scania, volvo);

//        vova.getCanRace(lada);
//        albert.getCanRace(kamaz);
//        nina.getCanRace(paz);
//
//        gaz.printType();
//        lada.printType();
//        kamaz.printType();
//        System.out.println(nina.stopMoving());
//        System.out.println(BodyType.COUPE);
//        System.out.println(Carrying.N_3);
//        System.out.println(Capacity.SMALL);
//        System.out.println(lada);
//        for (Transport transport : transports) {
//            printInfo(transport);
//        }


        ServiceStation serviceStation = new ServiceStation();

        serviceStation.addTruck(kamaz);
        serviceStation.addCar(bmw);
        serviceStation.addTruck(volvo);
        serviceStation.service();
        serviceStation.service();

        System.out.println(serviceStation);
    }


    private static void printInfo(Transport transport) {
        System.out.println(transport.getBrand() + " " + transport.getModel() + ". Водитель: ");
        for (Driver driver : transport.getDrivers()) {
            System.out.println(driver.getFullName());
        }
        System.out.println(transport.getSponsors());
        System.out.println("Механики: " + transport.getMechanics());
        System.out.println();
    }

    private static void getDiagnosed(Transport... transports) {
        for (Transport transport : transports) {
            getDiagnosedTransport(transport);

        }

    }

    private static void getDiagnosedTransport(Transport transport) {
        try {
            if (!transport.getDiagnosed()) {
                throw new RuntimeException(transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
