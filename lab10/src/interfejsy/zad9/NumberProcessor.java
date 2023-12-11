package interfejsy.zad9;

public class NumberProcessor implements DataProcessor{
    @Override
    public String processData(String data) {
        return "Processed:"+data;
    }

    @Override
    public boolean isValid(String data) {
        if (data == null)
            return false;
        return data.matches("-?\\d+(\\.\\d+)?");
    }
}
