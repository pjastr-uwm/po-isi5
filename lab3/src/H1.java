import java.awt.*;

public class H1 {

    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1);
        System.out.println(reverse(s1));
        System.out.println(reverse("")+".");
        //System.out.println(reverse(null));
    }

    public static String reverse(String arg)
    {
//        if(arg == null)
//        {
//            return null;
//        }
        StringBuilder temp = new StringBuilder(arg);
        temp.reverse();
        return temp.toString();
    }
}
