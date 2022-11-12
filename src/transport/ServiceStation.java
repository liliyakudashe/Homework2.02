package transport;

import java.util.ArrayDeque;
import java.util.Queue;

// станция техобслуживания
public class ServiceStation {
    private final Queue<Transport> transports = new ArrayDeque<>();

    private void add(Transport transport){
        transports.offer(transport);
    }
    public void addTrucks(Trucks trucks){
        add(trucks);
    }
    public void addPassengerCars(PassengerCars passengerCars){
        add(passengerCars);
    }
    public void service(){
        if (!transports.isEmpty()){
            Transport transport = transports.poll();
            boolean result = transport.passDiagnostics();
            if (!result){
                transport.fix();
            }
        }
    }
}
