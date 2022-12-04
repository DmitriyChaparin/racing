package Racing;

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
        Bus volgabus = new Bus("Volgabus", "14U0", 14, Capacity.VERY_LARGE);

        DriverB<Car> vova = new DriverB<>("Автомобилов Владимир Иномаркович", "B", 11);
        DriverC<Racing.Truck> albert = new Racing.DriverC<>("Камазов Альберт Колёсович", "D", 2);
        DriverD<Racing.Bus> nina = new Racing.DriverD<>("Пазикова Нина Сергеевна", "D", 0);

        getDiagnosed(audi, bmw, porsche, lada,
                paz, liaz, gaz, volgabus,
                kamaz, maz, scania, volvo);

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
