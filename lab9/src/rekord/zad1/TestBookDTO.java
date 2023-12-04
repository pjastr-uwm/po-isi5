package rekord.zad1;

public class TestBookDTO {

    public static void main(String[] args) {
        BookDTO b1 = new BookDTO("Pan Tadeusz", "Adam Mickiewicz",
                30.45, 2020);
        System.out.println(b1);
        BookDTO b2 = new BookDTO("Pan Tadeusz", "Adam Mickiewicz",
                30.45, 2020);
        BookDTO b3 = new BookDTO(new String("Pan Tadeusz"), "Adam Mickiewicz",
                30.45, 2020);
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
        BookDTO b4 = new BookDTO(null, "Adam Mickiewicz",
                30.45, 2020);
        System.out.println(b4);
        System.out.println(b1.author());
        System.out.println(b1.price());
        //b1.price() = 56.98;
        //BookDTO b5 = new BookDTO();
    }
}
