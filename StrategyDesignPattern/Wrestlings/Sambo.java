package DesignPatterns.StrategyDesignPattern.Wrestlings;
import DesignPatterns.StrategyDesignPattern.*;

public class Sambo implements WrestlingBehaviour {

    @Override
    public void wrestle() {
        System.out.println("Hits with sambo!");
    }
    
}
