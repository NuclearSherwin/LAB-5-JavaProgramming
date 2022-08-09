package Game;

public class BoardGame extends Game{
    private int minPlayers;
    private int maxPlayers;
    private int timeLimited;

    public BoardGame(String description, int minPlayers, int maxPlayers, int timeLimited) {
        super(description);
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.timeLimited = timeLimited;
    }

    public BoardGame(int minPlayers, int maxPlayers, int timeLimited) {
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.timeLimited = timeLimited;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getTimeLimited() {
        return timeLimited;
    }

    public void setTimeLimited(int timeLimited) {
        this.timeLimited = timeLimited;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "minPlayers=" + minPlayers +
                ", maxPlayers=" + maxPlayers +
                ", timeLimited=" + timeLimited +
                '}';
    }
}
