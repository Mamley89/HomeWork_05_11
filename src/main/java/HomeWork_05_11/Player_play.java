package HomeWork_05_11;

public class Player_play {

    public static void main(String[] args) {

    Player player1 = new Player(0, "Adidas", true);
    Player player2 = new Player(0, "Adidas", true);

       System.out.println(player1 == player2);
        System.out.println(player1.equals(player2));
    }
}
