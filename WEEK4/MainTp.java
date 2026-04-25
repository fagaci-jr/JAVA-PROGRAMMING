interface FareCalculator {
    double calculateFare(double distance);
}
class Bus implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 50;
    }
}
class Taxi implements FareCalculator {
    public double calculateFare(double distance) {
        return (distance * 100) + 200;
    }
}

public class MainTp {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        double distance = 10; // sir distance example

        System.out.println("Bus fare: " + bus.calculateFare(distance));
        System.out.println("Taxi fare: " + taxi.calculateFare(distance));
    }
}