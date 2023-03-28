package DesignPatterns.StrategyDesignPattern.Punches;
import DesignPatterns.StrategyDesignPattern.*;

public class UpperCut implements PunchingBehaviour {

    @Override
    public void punch() {
        System.out.println("Hits with upper cut!");
    }
    
}
