package VehicleSpecific;

import java.util.concurrent.atomic.AtomicInteger;

public class VehicleIDGenerator {
    private static final AtomicInteger idGenerator = new AtomicInteger(1);

    public static int getNextID() {
        return idGenerator.getAndIncrement();
    }
}
