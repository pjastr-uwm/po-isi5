public class C11 {

    public static void main(String[] args)
    {
        for(int i=1;i<10000;i++)
        {
            int sumaDzielnikow = 0;
            for(int j=1;j<= i/2;j++)
            {
                if (i % j ==0)
                {
                    sumaDzielnikow += j;
                }
            }
            if (sumaDzielnikow == i)
            {
                System.out.println(i);
            }
        }
    }
}
