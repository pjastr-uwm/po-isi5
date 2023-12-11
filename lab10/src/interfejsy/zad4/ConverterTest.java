package interfejsy.zad4;

public class ConverterTest {

    public static void main(String[] args) {
        CurrencyConverter c1 = new CurrencyConverter();
        System.out.println(c1.convertToUSD(100));
        System.out.println(c1.getConversionRate("EUR"));
        UnitConverter u1 = new UnitConverter();
        System.out.println(u1.convertToUSD(400));
    }
}
