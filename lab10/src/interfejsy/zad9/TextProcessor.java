package interfejsy.zad9;

public class TextProcessor implements DataProcessor{
    @Override
    public String processData(String data) {
        if (data == null)
            return null;
        StringBuilder temp = new StringBuilder(data);
        temp.reverse();
        return temp.toString();
    }

    @Override
    public boolean isValid(String data) {
        if (data == null)
            return false;
        return !data.isEmpty();
    }
}
