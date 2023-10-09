import java.util.Scanner;

import static java.lang.Math.sqrt;

public class B4 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a");
        double a = input.nextDouble();
        System.out.println("Podaj b");
        double b = input.nextDouble();
        System.out.println("Podaj c");
        double c = input.nextDouble();
        if (a!= 0)
        {
            double delta = b*b - 4 * a * c;
            if (delta >0)
            {
                double s = sqrt(delta);
                System.out.println("x1="+ (-b-s)/(2*a));
                System.out.println("x2="+ (-b+s)/(2*a));
            }
            else if (delta == 0)
            {
                System.out.println("x="+ (-b)/(2*a));
            }
            else
            {
                System.out.println("Brak rozw.");
            }
        }
        else
        {
            if (b!=0)
            {
                System.out.println("x="+ (-c)/b);
            }
            else
            {
                if (c!= 0)
                {
                    System.out.println("Brak rozw.");
                }
                else
                {
                    System.out.println("Nieskończenie wiele rozw.");
                }
            }
        }

    }
}
