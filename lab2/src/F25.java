import java.util.Arrays;

public class F25 {

    public static void main(String[] args) {
        int[] t1 = {3,-4,55};
        int[] t2 = {3,-4,55};
        int[] t3 = {3,-4,55, 0,-3};
        System.out.println(checkEquality(t1, t2));
        System.out.println(checkEquality(t1, t3));
        System.out.println(checkEquality(t3, t2));
    }

    public static boolean checkEquality(int[] tab1, int[] tab2)
    {
        return Arrays.equals(tab1, tab2);
    }
}
