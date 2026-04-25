
abstract class Food {
    abstract void taste();
}
class Rice extends Food {
    void taste() {
        System.out.println("Rice tastes soft and mild.");
    }
}
class Pizza extends Food {
    void taste() {
        System.out.println("Pizza tastes cheesy and delicious.");
    }
}

public class MainFood {
    public static void main(String[] args) {
        Food rice = new Rice();
        Food pizza = new Pizza();
        rice.taste();
        pizza.taste();
    }
}