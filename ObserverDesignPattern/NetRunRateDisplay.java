package DesignPatterns.ObserverDesignPattern;

public class NetRunRateDisplay implements Observer {

    @Override
    public void update(Subject s) {
        display((CricketData) s);
    }

    private void display(CricketData data) {
        System.out.println("---------Net RUN RATE---------");
        System.out.println("Net Run Rate = " + (data.getRuns() * 1.0)/data.getOvers());
    }
    
}
