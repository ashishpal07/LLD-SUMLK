package DesignPatterns.ChainOfResponsibility;

public class RealHandler1 extends Handler {

    public RealHandler1(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request obj) {
        if(obj.state > 0) {
            System.out.println("All positive no are handle here");
        } else if(next != null) {
            System.out.println("Not a positive number hence delegating forward");
            next.handleRequest(obj);
        }
    }
    
}
