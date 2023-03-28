package DesignPatterns.StrategyDesignPattern.Wrestlings;
import DesignPatterns.StrategyDesignPattern.*;

public class Submission implements WrestlingBehaviour {

    @Override
    public void wrestle() {
        System.out.println("Hits with submission!");
    }
    
}
