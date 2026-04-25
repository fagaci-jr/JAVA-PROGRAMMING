
abstract class Subject {
    abstract void study();
}
class Math extends Subject {
    void study() {
        System.out.println("Studying Mathematics: solving equations and problems.");
    }
}
class English extends Subject {
    void study() {
        System.out.println("Studying English: reading and writing.");
    }
}
public class MainSubject {
    public static void main(String[] args) {
        Subject math = new Math();
        Subject english = new English();
        math.study();
        english.study();
    }
}