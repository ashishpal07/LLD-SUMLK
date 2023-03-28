package DesignPatterns.StrategyDesignPattern.Punches;
import DesignPatterns.StrategyDesignPattern.*;

public class HookPunch implements PunchingBehaviour {

    @Override
    public void punch() {
        System.out.println("Hits with hook punch!");
    }
    
}
