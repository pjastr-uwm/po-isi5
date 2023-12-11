package interfejsy.zad9;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class TestDataProcessor {

    public static void main(String[] args) {
        TextProcessor t1 = new TextProcessor();
        System.out.println(t1.processData("ABC"));
        System.out.println(t1.isValid(null));
        NumberProcessor n1 = new NumberProcessor();
        System.out.println(n1.processData(null));
        System.out.println(n1.isValid("rff"));
        System.out.println(n1.isValid("45.3"));
        System.out.println(n1.isValid("656"));
        ArrayList<DataProcessor> lista = new ArrayList<>();
        lista.add(new TextProcessor());
        lista.add(new NumberProcessor());
        String temp = "45.677";
        for(DataProcessor elem: lista){
            System.out.println(elem.isValid(temp));
        }
    }
}
