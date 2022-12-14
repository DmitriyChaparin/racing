package Racing;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport> transports = new ArrayDeque<>();

    private void add(Transport transport) {
        transports.offer(transport);
    }

    public void addCar(Car car) {
       add(car);
    }

   public void addTruck(Truck truck) {
        add(truck);
    }

    public void service() {
        if (!transports.isEmpty()) {
            Transport transport = transports.poll();
           boolean result =  transport.getDiagnosed();
            if (!result) {
                transport.repair();
            }



        }
    }

    @Override
    public String toString() {
        return "В сервисе:" + transports ;
    }
}
