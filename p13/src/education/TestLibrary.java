package education;

import java.util.ArrayList;

public class TestLibrary {

    public static void main(String[] args) {
        ArrayList<Library> lista = new ArrayList<>();
        lista.add(new Library("name1", "loc1", -9));
        lista.add(new Library("name2", "loc2", 34));
        lista.add(new Library("name3", null, 2334));
        lista.add(new SchoolLibrary("name4", "loc4", 344,
                "type4", 20));
        lista.add(new SchoolLibrary("name5", "loc5", 5656,
                "", -9));
        for(Library elem: lista){
            System.out.println(elem.toString());
            elem.addBooks(20);
        }
    }
}
