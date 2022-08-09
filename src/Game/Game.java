package Game;

public class Game {
    private String description;

    public Game(String description) {
        this.description = description;
    }

    public Game() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Game{" +
                "description='" + description + '\'' +
                '}';
    }
}
