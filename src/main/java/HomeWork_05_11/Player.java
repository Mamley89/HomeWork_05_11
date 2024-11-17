package HomeWork_05_11;

import java.util.Objects;

public class Player {
    private int id;

    private String nicname;

    private boolean isOnline;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && isOnline == player.isOnline && Objects.equals(nicname, player.nicname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nicname, isOnline);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nicname='" + nicname + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }

    public Player(int id, String nicname, boolean isOnline) {
        this.id = id;
        this.nicname = nicname;
        this.isOnline = isOnline;
    }

    public Player(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
