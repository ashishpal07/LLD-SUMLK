package DesignPatterns.StrategyDesignPattern.Punches;
import DesignPatterns.StrategyDesignPattern.*;

public class JabPunch implements PunchingBehaviour {

    @Override
    public void punch() {
        System.out.println("Hits with  jab!");
    }
    
}
