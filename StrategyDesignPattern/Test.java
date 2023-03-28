package DesignPatterns.StrategyDesignPattern;

import DesignPatterns.StrategyDesignPattern.Punches.*;
import DesignPatterns.StrategyDesignPattern.kicks.*;
import DesignPatterns.StrategyDesignPattern.Wrestlings.*;

public class Test {
    
    public static void main(String[] args) {
        
        Fighter f1 = new Fighter();
        f1.pb = new FacePunch();
        f1.kb = new JumpKick();
        f1.wb = new Freestyle();

        f1.fight();

    }

}
