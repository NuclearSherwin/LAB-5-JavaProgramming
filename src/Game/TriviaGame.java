package Game;

public class TriviaGame extends Game{
    private int price;
    private int nbWinningQuestion;

    public TriviaGame(String description, int price, int nbWinningQuestion) {
        super(description);
        this.price = price;
        this.nbWinningQuestion = nbWinningQuestion;
    }

    public TriviaGame(int price, int nbWinningQuestion) {
        this.price = price;
        this.nbWinningQuestion = nbWinningQuestion;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNbWinningQuestion() {
        return nbWinningQuestion;
    }

    public void setNbWinningQuestion(int nbWinningQuestion) {
        this.nbWinningQuestion = nbWinningQuestion;
    }

    @Override
    public String toString() {
        return "TriviaGame{" +
                "price=" + price +
                ", nbWinningQuestion=" + nbWinningQuestion +
                '}';
    }
}
