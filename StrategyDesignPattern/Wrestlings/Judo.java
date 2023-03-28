package DesignPatterns.StrategyDesignPattern.Wrestlings;
import DesignPatterns.StrategyDesignPattern.*;

public class Judo implements WrestlingBehaviour {

    @Override
    public void wrestle() {
        System.out.println("Hits with judo!");
    }
    
}
