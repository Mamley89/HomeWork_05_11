package HomeWork_05_11;

import java.util.ArrayList;
import java.util.List;

public class Homework {
    public static void main(String[] args) {

        List<Company> companies = new ArrayList<>();
        companies.add(new Company("DC", 1934));
        companies.add(new Company("Marvel", 1939));
        companies.add(new Company("Universal", 1925));

        List<String> dcFilms = companies.get(0).getFilms();
        List<String> marvelFilms = companies.get(1).getFilms();
        List<String> universalFilms = companies.get(2).getFilms();


        dcFilms.add("Black Knight");
        dcFilms.add("Joker");
        dcFilms.add("Pinguin");

        marvelFilms.add("Spider man");
        marvelFilms.add("Iron man");
        marvelFilms.add("Kap America");

        universalFilms.add("Warcraft");
        universalFilms.add("Forsage");
        universalFilms.add("Gladiator ");

        for (Company company : companies)
        {
            System.out.println(company.getName() + ": " + company.getFilms());
        }
    }
}
