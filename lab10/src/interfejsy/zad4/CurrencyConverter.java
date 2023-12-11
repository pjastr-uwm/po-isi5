package interfejsy.zad4;

public class CurrencyConverter implements Converter{
    @Override
    public double convertToEuro(double amount) {
        return amount * 4.54;
    }

    @Override
    public double convertToUSD(double amount) {
        return amount * 4.21;
    }

    @Override
    public double getConversionRate(String currency) {
        return 4.32;
    }
}
