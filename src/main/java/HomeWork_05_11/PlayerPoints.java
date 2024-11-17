package HomeWork_05_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerPoints {

    public static void main(String[] args) {
        Map<Player, Integer> points = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            Integer point = switch (i) {
                case 4 -> 10;
                case 7 -> 12;
                case 8 -> 11;
                case 9 -> 13;
                case 10 -> 5;
                default -> 0;
            };
            points.put(new Player(i), point);
        }

        printLeaders(points);
    }

    private static void printLeaders(Map<Player, Integer> points) {
        List<Map.Entry<Player, Integer>> sortedPoints = new ArrayList<>(points.entrySet());
        sortedPoints.sort(Map.Entry.comparingByValue());

        System.out.println("Лучшие игроки турнира");
        for (int i = sortedPoints.size() - 1; i > sortedPoints.size() - 4; i--) {
            Map.Entry<Player, Integer> playerPoints = sortedPoints.get(i);
            System.out.println("Игрок " + playerPoints.getKey().getId() + " набрал " + playerPoints.getValue() + " очков");
        }
    }
}
