package HomeWork_05_11;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;

    private int faundationyear;

    private List<String> films;


    public void setName(String name) {
        this.name = name;
    }


    public void setFaundationyear(int faundationyear) {
        this.faundationyear = faundationyear;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

       public String getName() {
        return name;
    }

    public int getFaundationyear() {
        return faundationyear;
    }

    public List<String> getFilms() {
        return films;
    }

    public Company(String name, int faundationyear) {
        this.name = name;
        this.faundationyear = faundationyear;
        this.films = new ArrayList<>();
      }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", faundationyear=" + faundationyear +
                ", films=" + films +
                '}';
    }
}