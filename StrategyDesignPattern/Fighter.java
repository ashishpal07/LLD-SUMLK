package DesignPatterns.StrategyDesignPattern;

public class Fighter {
    
    PunchingBehaviour pb;
    KickingBehaviour kb;
    WrestlingBehaviour wb;

    // public Fighter() {
    //     kb = new JumpKick();
    //     pb = new HookPunch();
    //     wb = new Freestyle();
    // }

    void fight() {
        pb.punch();
        kb.kick();
        wb.wrestle();
    }

}
