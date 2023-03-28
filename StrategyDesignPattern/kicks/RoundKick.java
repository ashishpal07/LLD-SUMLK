package DesignPatterns.StrategyDesignPattern.kicks;
import DesignPatterns.StrategyDesignPattern.*;

public class RoundKick implements KickingBehaviour {

    @Override
    public void kick() {
        System.out.println("Hits with round kick !");
    }
    
}
