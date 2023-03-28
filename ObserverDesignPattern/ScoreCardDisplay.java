package DesignPatterns.ObserverDesignPattern;

public class ScoreCardDisplay implements Observer {

    @Override
    public void update(Subject s) {
        display((CricketData) s);
    }

    private void display(CricketData data) {
        System.out.println("----------Score Card Display-------");
        System.out.println("Score = " + data.getRuns());
        System.out.println("Wickets = " + data.getWickets());
        System.out.println("Overs = " + data.getOvers());
        System.out.println("NRR = " + (data.getRuns() * 1.0) / data.getOvers());
    }
    
}
