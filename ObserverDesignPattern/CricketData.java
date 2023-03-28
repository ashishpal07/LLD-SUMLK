package DesignPatterns.ObserverDesignPattern;

public class CricketData extends Subject {
    
    private int runs;
    private int wickets;
    private double overs;

    public int getRuns() {
        return runs;
    }

    public double getOvers() {
        return overs;
    }

    public int getWickets() {
        return wickets;
    }
    
    public void setData(int runs, int wickets, double overs) {
        this.runs = runs;
        this.overs = overs;
        this.wickets = wickets;
        super.notifyObservers();
    }

}
