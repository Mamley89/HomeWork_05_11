package HomeWork_05_11;

public class Movie {

public  String name;

public int rating;

public String genre;

public String country;

public Boolean oscar;

    public Movie(String name, int rating, String genre, String country, Boolean oscar) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.oscar = oscar;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", oscar=" + oscar +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public String getCountry() {
        return country;
    }

    public Boolean getOscar() {
        return oscar;
    }
}
