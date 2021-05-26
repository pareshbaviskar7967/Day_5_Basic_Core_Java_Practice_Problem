import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        int headwin = 0;
        int tailwin = 0;
        Random value = new Random();
        for (int p = 0; p < 15; p++) {

            int flip = value.nextInt(2);
            if (flip < 0.5) {
                tailwin++;

            } else {
                headwin++;

            }
        }
        System.out.println("Tail" + tailwin);
        System.out.println("Head" + headwin);
    }

}