package lk.sliit.flipthecard;

/**
 * Created by Chanuka on 25-May-2017.
 */

public class Player {

    private int score, trys, highEasy;

    public Player(int score, int trys, int highEasy) {
        this.score = score;
        this.trys = trys;
        this.highEasy = highEasy;
    }

    public int getScore() {
        return score;
    }

    public void increaseScore() {
        score = score + 10;
    }

    public void decreaseScore() {
        score = score - 10;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTrys() {
        return trys;
    }

    public void setTrys(int trys) {
        this.trys = trys;
    }

    public void increaseTrys() {
        trys++;
    }

    public int getHighEasy() {
        return highEasy;
    }

    public void setHighEasy(int highEasy) {
        this.highEasy = highEasy;
    }

}
