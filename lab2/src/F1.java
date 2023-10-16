import java.util.Random;

public class F1 {

    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(123456);
        int[] tab = new int[10];
        for(int i=0;i<tab.length;i++)
        {
            tab[i] = random.nextInt();
        }
        for(int i= tab.length-1;i>=0;i--)
        {
            System.out.println(tab[i]);
        }
    }
}
