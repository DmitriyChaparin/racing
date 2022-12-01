public class Test {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "A4RS", 3.0);
        Car bmw = new Car("BMW", "325M", 2.5);
        Car porsche = new Car("Porsche", "911", 2.6);
        Car lada = new Car("Lada", "Vesta", 1.8);
        Truck kamaz = new Truck("Kamaz", "5540", 12);
        Truck maz = new Truck("MAZ", "5566", 11.5);
        Truck scania = new Truck("Scania", "R500", 10.3);
        Truck volvo = new Truck("Volvo", "RS300", 15);
        Bus paz = new Bus("PAZ", "T132", 10);
        Bus liaz = new Bus("Liaz", "Speed77", 11.8);
        Bus gaz = new Bus("GAZ", "G879", 9.5);
        Bus volgabus = new Bus("Volgabus", "14U0", 14);
        DriverB<Car> vova = new DriverB<>("Автомобилов Владимир Иномаркович", true, 11);
        vova.getCanRace(lada);
        System.out.println(vova.stopMoving());
        System.out.println(vova.refuelCar());
        DriverC<Truck> albert = new DriverC<>("Камазов Альберт Колёсович", false, 2);
        albert.getCanRace(kamaz);
        DriverD<Bus> nina = new DriverD<>("Пазикова Нина Сергеевна",false,0);
        nina.getCanRace(paz);
        System.out.println(nina.stopMoving());
        System.out.println(lada);
        System.out.println(vova);
    }
}
