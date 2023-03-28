package DesignPatterns.StrategyDesignPattern.kicks;
import DesignPatterns.StrategyDesignPattern.*;

public class JumpKick implements KickingBehaviour {

    @Override
    public void kick() {
        System.out.println("Hits with jump kick!");
    }
    
}
