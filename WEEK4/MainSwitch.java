interface Switchable {
    void turnOn();
    void turnOff();
}
class TV implements Switchable {
    public void turnOn() {
        System.out.println("TV is now ON");
    }
    public void turnOff() {
        System.out.println("TV is now OFF");
    }
}
class AirConditioner implements Switchable {
    public void turnOn() {
        System.out.println("Air Conditioner is now ON");
    }

    public void turnOff() {
        System.out.println("Air Conditioner is now OFF");
    }
}
public class MainSwitch
 {
    public static void main(String[] args) {
        Switchable tv = new TV();
        Switchable ac = new AirConditioner();

        tv.turnOn();
        tv.turnOff();

        ac.turnOn();
        ac.turnOff();
    }
}