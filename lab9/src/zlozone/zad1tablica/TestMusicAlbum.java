package zlozone.zad1tablica;

public class TestMusicAlbum {

    public static void main(String[] args) {
        double[] tablica = {4,5,-8.3, 7, 23};
        MusicAlbum m2 = new MusicAlbum("ewr","tyty", tablica);
        MusicAlbum m1 = new MusicAlbum("ewr","tyty", new double[]{4, 5, -8.3, 7, 23});
        System.out.println(m1);
        System.out.println(m1.equals(m2));
    }
}
