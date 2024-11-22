package VehicleSpecific;

import CarRentalSystem.Vehicle;
import CarRentalSystem.VehicleFactory;

import java.util.UUID;

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
    //inner class ToyotaCorolla
    class ToyotaCorolla extends Vehicle {

        // Static ID generator (thread-safe)


        public ToyotaCorolla() {
            super(
                    VehicleIDGenerator.getNextID(),   // Generate a unique vehicleID
                    "Corolla",                               // Model
                    "Toyota",                                // Brand
                    "Sedan",                                 // Type
                    generateLicensePlate(),                  // Generate a unique license plate
                    "Available",                             // Status
                    60.0f,                                   // Rate per day
                    18000.0f                                 // Mileage
            );
        }

        // Method to generate a unique license plate
        private static String generateLicensePlate() {
            return "T" + UUID.randomUUID().toString().substring(0, 7).toUpperCase(); // Prefix 'T' for Toyota
        }

        @Override
        public String toString() {
            return "ToyotaCorolla{" + super.toString() + "}";
        }
    }
}
