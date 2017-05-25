package lk.sliit.flipthecard;

/**
 * Created by Chanuka on 25-May-2017.
 */

public class Player {

    private int score, trys, highEasy, highNormal, highHard, highTimeTrial;

    public Player(int score, int trys, int highEasy, int highNormal, int highHard, int highTimeTrial) {
        this.score = score;
        this.trys = trys;
        this.highEasy = highEasy;
        this.highNormal = highNormal;
        this.highHard = highHard;
        this.highTimeTrial = highTimeTrial;
    }

    public int getScore() {
        return score;
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

    public int getHighEasy() {
        return highEasy;
    }

    public void setHighEasy(int highEasy) {
        this.highEasy = highEasy;
    }

    public int getHighNormal() {
        return highNormal;
    }

    public void setHighNormal(int highNormal) {
        this.highNormal = highNormal;
    }

    public int getHighHard() {
        return highHard;
    }

    public void setHighHard(int highHard) {
        this.highHard = highHard;
    }

    public int getHighTimeTrial() {
        return highTimeTrial;
    }

    public void setHighTimeTrial(int highTimeTrial) {
        this.highTimeTrial = highTimeTrial;
    }
}
