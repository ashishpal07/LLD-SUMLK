package DesignPatterns.StrategyDesignPattern.kicks;
import DesignPatterns.StrategyDesignPattern.*;

public class RappleKick implements KickingBehaviour {

    @Override
    public void kick() {
        System.out.println("Hits with rapple kick!");
    }
    
}
