interface Playable {
    void play();
}
class Piano implements Playable {
      public void play() {
        System.out.println("Piano is playing");
    }
}
class Guitar implements Playable {
     public void play() {
        System.out.println("Guitar is strumming");
    }
}
public class MainPlay {
    public static void main(String[] args) {
        Playable piano = new Piano();
        Playable guitar = new Guitar();

        piano.play();
        guitar.play();
    }
}