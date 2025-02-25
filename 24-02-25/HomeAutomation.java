class SmartHome {
    public final static class Device {
        private final String name;
        private final int id;
        static final int Max_Devices = 50;

        Device(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public final void getDeviceInfo() {
            System.out.println("Device Name : " + name);
            System.out.println("Device Id : " + id);
        }
    }

    public abstract static class DeviceType {
        public abstract String getDeviceCategory();
    }

    public final class config {
        static final int MAX_POWER_LIMIT = 5000;

    }

    public static class LigthDevice extends DeviceType {
        @Override
        public String getDeviceCategory() {
            return "Lighting";
        }
    }

    public static class FanDEvice extends DeviceType {
        @Override
        public String getDeviceCategory() {
            return "Cooling Device";
        }
    }
}

public class HomeAutomation {
    public static void main(String[] args) {
        SmartHome.Device device = new SmartHome.Device("Smart Ligth", 123);
        device.getDeviceInfo();
        System.out.println("MAX_POWER_LIMIT : " + SmartHome.config.MAX_POWER_LIMIT);
        SmartHome.DeviceType ligthdevice = new SmartHome.LigthDevice();
        SmartHome.DeviceType fandevice = new SmartHome.FanDEvice();
        System.out.println("Ligth Device : " + ligthdevice.getDeviceCategory());
        System.out.println("Fan Device : " + fandevice.getDeviceCategory());

    }
}