import java.util.Random;

public class Losowosc {

    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(346566544);
        int x = random.nextInt(101);
        System.out.println(x);
    }
}
