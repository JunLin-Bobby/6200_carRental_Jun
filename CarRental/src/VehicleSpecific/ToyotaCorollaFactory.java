package VehicleSpecific;

import CarRentalSystem.Vehicle;
import CarRentalSystem.VehicleFactory;

public class ToyotaCorollaFactory  implements VehicleFactory {

    // Factory method to produce only Toyota Corolla
    public Vehicle getObject() {
        return new ToyotaCorolla();
    }

    /**
     * Singleton Enum for ToyotaCorollaFactory
     */
    private enum ToyotaCorollaFactoryEnumSingleton {

        INSTANCE;

        private final ToyotaCorollaFactory factory;

        ToyotaCorollaFactoryEnumSingleton() {
            factory = new ToyotaCorollaFactory();
        }

        public ToyotaCorollaFactory get() {
            return factory;
        }
    }

    // Public method to access the singleton factory
    public static ToyotaCorollaFactory getInstance() {
        return ToyotaCorollaFactoryEnumSingleton.INSTANCE.get();
    }
}
