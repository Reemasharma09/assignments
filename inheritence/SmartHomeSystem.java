class Device {
    private String deviceId;
    private String status;
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}
class Thermostat extends Device {
    private int temperatureSetting;
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
public class SmartHomeSystem {
    public static void main(String[] args) {
        Device device1 = new Device("D001", "On");
        Thermostat thermostat1 = new Thermostat("T001", "On", 24);
        System.out.println("=== Generic Device ===");
        device1.displayStatus();
        System.out.println("\n=== Thermostat ===");
        thermostat1.displayStatus();
    }
}