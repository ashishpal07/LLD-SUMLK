package DesignPatterns.StrategyDesignPattern.Wrestlings;
import DesignPatterns.StrategyDesignPattern.*;

public class Freestyle implements WrestlingBehaviour {

    @Override
    public void wrestle() {
       System.out.println("Hits with free style!");
    }
    
}
