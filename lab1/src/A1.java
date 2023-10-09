import java.util.Scanner;

public class A1 {
    public static void main(String[] args)
    {
        System.out.println("Kalkulator");
        System.out.println("Podaj pierwszą liczbę");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = input.nextInt();
        System.out.println("Dodawanie: "+ (a+b));
    }
}
