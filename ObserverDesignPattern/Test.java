package DesignPatterns.ObserverDesignPattern;

public class Test {
    public static void main(String[] args) {
        
        CricketData cd = new CricketData();
        cd.setData(120, 0, 10);

        NetRunRateDisplay nrr = new NetRunRateDisplay();
        ScoreCardDisplay scoreCard = new ScoreCardDisplay();
        FinalScorePredictor fsp = new FinalScorePredictor();

        cd.registerObserver(scoreCard);
        cd.registerObserver(nrr);
        cd.registerObserver(fsp);

        cd.setData(180, 1, 17);

    }
}
