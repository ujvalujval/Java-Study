class InnerParkingSystem {
    final static class ParkingSlot {
        String SlotId;
        String VehicleType;

        ParkingSlot(String SlotId, String VehicleType) {
            this.SlotId = SlotId;
            this.VehicleType = VehicleType;
        }

        final void getSlotInfo() {
            System.out.println("Slot Id: " + SlotId);
            System.out.println("Vehicle Type: " + VehicleType);
        }
    }

    final static class Config {
        final static int MAX_PARKING_SLOTS = 1000;
    }

    abstract static class VehicleType {
        abstract String getVehicleCategory();
    }

    public static class Car extends VehicleType {
        @Override
        String getVehicleCategory() {
            return "This is a Car";
        }
    }

    public static class Bike extends VehicleType {
        @Override
        String getVehicleCategory() {
            return "This is a Bike";
        }
    }
}

public class parkingAutomation {
    public static void main(String[] args) {
        InnerParkingSystem.ParkingSlot obj = new InnerParkingSystem.ParkingSlot("123", "Bike");
        obj.getSlotInfo();

        System.out.println("MAX_PARKING_SLOTS: " + InnerParkingSystem.Config.MAX_PARKING_SLOTS);

        InnerParkingSystem.VehicleType car = new InnerParkingSystem.Car();
        System.out.println("Parking: " + car.getVehicleCategory());

        InnerParkingSystem.VehicleType bike = new InnerParkingSystem.Bike();
        System.out.println("Parking: " + bike.getVehicleCategory());
    }
}
