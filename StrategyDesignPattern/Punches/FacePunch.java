package DesignPatterns.StrategyDesignPattern.Punches;
import DesignPatterns.StrategyDesignPattern.*;

public class FacePunch implements PunchingBehaviour {

    @Override
    public void punch() {
        System.out.println("Hits with face punch!");
    }
    
}
