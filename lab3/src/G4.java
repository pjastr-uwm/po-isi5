import java.util.ArrayList;

public class G4 {

    public static void main(String[] args) {
        ArrayList<Double> lt = new ArrayList<>();
        lt.add(-4.2);
        lt.add(43.2);
        lt.add(9.1);
        System.out.println(lt);
        System.out.println(minimumValue(lt));
        //ArrayList<Double> lt2 = new ArrayList<>();
        //System.out.println(minimumValue(lt2));
        //ArrayList<Double> lt3 = null;
        //System.out.println(minimumValue(lt3));
    }

    public static double minimumValue(ArrayList<Double> arg)
    {
//        if (arg == null || arg.isEmpty())
//        {
//            throw new IllegalArgumentException("Lista tablicowa jest pusta lub jest nullem");
//        }
        double temp = arg.get(0);
        for(double elem: arg)
        {
            if (elem < temp)
            {
                temp =elem;
            }
        }
        return temp;
    }
}
