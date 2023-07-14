import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Film {
    private String nama;
    private int tahun;
    private double rating;

    public Film(String nama, int tahun, double rating) {
        this.nama = nama;
        this.tahun = tahun;
        this.rating = rating;
    }

    public String getNama() {
        return nama;
    }

    public int getTahun() {
        return tahun;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "nama='" + nama + '\'' +
                ", tahun=" + tahun +
                ", rating=" + rating +
                '}';
    }
}

public class Mostpopularmovies {
    public static void main(String[] args) {
        // Membuat objek-objek Film
        Film TheFlash = new Film("Film The Flash", 2023, 7.3);
        Film SpiderMan = new Film("Spider Man : Acros the Spider-Verse", 2019, 7.9);
        Film Transformers = new Film("Transformers", 2023, 6.6);
        Film Avatar = new Film("Avatar", 2022, 7.6);
        Film FastX = new Film("FastX", 2023, 6.0);

        // Menambahkan film-film ke dalam list
        List<Film> filmList = new ArrayList<>();
        filmList.add(TheFlash);
        filmList.add(SpiderMan);
        filmList.add(Transformers);
        filmList.add(Avatar);
        filmList.add(FastX);

        // Menampilkan semua film terlaris
        System.out.println("Daftar Film Terlaris:");
        for (Film film : filmList) {
            System.out.println(film);
        }

        // Mengurutkan film-film berdasarkan rating (descending)
        Collections.sort(filmList, Comparator.comparingDouble(Film::getRating).reversed());

        // Menampilkan film-film setelah diurutkan
        System.out.println("\nDaftar Film Terlaris setelah Diurutkan:");
        for (Film film : filmList) {
            System.out.println(film);
        }
    }
}
