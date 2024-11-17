package HomeWork_05_11;

import java.util.ArrayList;
import java.util.List;

public class Films {
    public static void main(String[] args) {
        List<Movie> Films = new ArrayList<>();
        Films.add(new Movie("Мстители", 8, "Фантасктика", "USA", true));
        Films.add(new Movie("Отомстители", 2, "Пародия", "India", false));
        Films.add(new Movie("Жуки", 10, "Документальное", "Russia", true));

        Movie myLove = Films.get(1);
        System.out.println(myLove);
    }
}
