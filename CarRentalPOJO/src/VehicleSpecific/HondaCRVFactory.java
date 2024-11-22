package VehicleSpecific;

import CarRentalSystem.Vehicle;
import CarRentalSystem.VehicleFactory;

import java.util.UUID;

public class HondaCRVFactory implements VehicleFactory {

    // Factory method to produce a unique HondaCRV
    public Vehicle getObject() {
        return new HondaCRV();
    }

    /**
     * Singleton Enum for HondaCRVFactory
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

    //inner class HondaCRV
    class HondaCRV extends Vehicle {
        public HondaCRV() {
            super(
                    VehicleIDGenerator.getNextID(),           // Generate a unique vehicleID
                    "CRV",                                   // Model
                    "Honda",                                 // Brand
                    "SUV",                                   // Type
                    generateLicensePlate(),                  // Generate a unique license plate
                    "Available",                             // Status
                    75.5f,                                   // Rate per day
                    20000.0f                                 // Mileage
            );
        }

        // Method to generate a unique license plate
        private static String generateLicensePlate() {
            return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        }

        @Override
        public String toString() {
            return "CarRentalSystem.Vehicle{" +
                    "vehicleID=" + vehicleID +
                    ", model='" + model + '\'' +
                    ", brand='" + brand + '\'' +
                    ", type='" + type + '\'' +
                    ", licensePlate='" + licensePlate + '\'' +
                    ", status='" + status + '\'' +
                    ", ratePerDay=" + ratePerDay +
                    ", mileage=" + mileage +
                    '}';
        }
    }

}
