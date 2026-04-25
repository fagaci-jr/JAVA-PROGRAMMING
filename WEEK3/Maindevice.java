abstract class Device {
    abstract void turnOn();
}
class Fan extends Device {
    void turnOn() {
        System.out.println("Fan is now spinning.");
    }
}
class Light extends Device {
        void turnOn() {
        System.out.println("Light is now on.");
    }
}
public class MainDevice {
    public static void main(String[] args) {
        Device fan = new Fan();
        Device light = new Light();

        fan.turnOn();
        light.turnOn();
    }
}