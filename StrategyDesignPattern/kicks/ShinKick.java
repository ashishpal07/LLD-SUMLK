package DesignPatterns.StrategyDesignPattern.kicks;
import DesignPatterns.StrategyDesignPattern.*;

public class ShinKick implements KickingBehaviour {

    @Override
    public void kick() {
        System.out.println("Hits with the shin kick!");
    }
    
}
