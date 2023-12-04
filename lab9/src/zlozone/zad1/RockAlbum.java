package zlozone.zad1;

import java.util.ArrayList;
import java.util.Objects;

public class RockAlbum extends MusicAlbum{

    private String rockGenre;

    public RockAlbum(String title, String artist, ArrayList<Double> ratings, String rockGenre) {
        super(title, artist, ratings);
        this.rockGenre = rockGenre;
    }

    public String getRockGenre() {
        return rockGenre;
    }

    public void setRockGenre(String rockGenre) {
        this.rockGenre = rockGenre;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", rockGenre='" + rockGenre ;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        RockAlbum rockAlbum = (RockAlbum) o;

        return Objects.equals(rockGenre, rockAlbum.rockGenre);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (rockGenre != null ? rockGenre.hashCode() : 0);
        return result;
    }
}
