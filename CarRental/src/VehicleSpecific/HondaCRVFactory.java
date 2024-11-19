package VehicleSpecific;

import CarRentalSystem.Vehicle;
import CarRentalSystem.VehicleFactory;

public class HondaCRVFactory implements VehicleFactory {

    // Factory method to produce only HONDACRV
    public Vehicle getObject() {
        return new HondaCRV();
    }

    /**
     * Singleton Enum for VehicleSpecific.HondaCRVFactory
     */
    private enum HondaCRVFactoryEnumSingleton {

        INSTANCE;

        private final HondaCRVFactory factory;

        HondaCRVFactoryEnumSingleton() {
            factory = new HondaCRVFactory();
        }

        public HondaCRVFactory get() {
            return factory;
        }
    }

    // Public method to access the singleton factory
    public static HondaCRVFactory getInstance() {
        return HondaCRVFactoryEnumSingleton.INSTANCE.get();
    }
}