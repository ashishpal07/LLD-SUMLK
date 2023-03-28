package DesignPatterns.ObserverDesignPattern;

public class FinalScorePredictor implements Observer {

    @Override
    public void update(Subject s) {
        display((CricketData) s);
    }

    private void display(CricketData data) {

        System.out.println("-----------Final Score Predictor---------");
        if(data.getWickets() == 0) {
            System.out.println("Predicted Score = " + (data.getRuns() / data.getOvers()) * (50 - data.getRuns()) + 20);
        } else {
            System.out.println("Predicted Score = " + (data.getRuns() / data.getOvers()) * (50.0 - data.getOvers()));
        }

    }
    
}
