package inherit;


class Device {
 String deviceId;
 String status;

 public Device(String deviceId, String status) {
     this.deviceId = deviceId;
     this.status = status;
 }

 public void displayStatus() {
     System.out.println("Device ID: " + deviceId + ", Status: " + status);
 }
}

class Thermostat extends Device {
 double temperatureSetting;

 public Thermostat(String deviceId, String status, double temperatureSetting) {
     super(deviceId, status);
     this.temperatureSetting = temperatureSetting;
 }


 public void displayStatus() {
     super.displayStatus();
     System.out.println("Temperature Setting: " + temperatureSetting + "°C");
 }
}

public class SmartHomeDevices {
 public static void main(String[] args) {
     Thermostat thermostat = new Thermostat("T001", "Active", 22.5);
     System.out.println("--- Smart Home Devices ---");
     thermostat.displayStatus();
 }
}
