package DesignPatterns.ChainOfResponsibility;

public class RealHandler3 extends Handler {
    
    public RealHandler3(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request obj) {
        if(obj.state < 0) {
            System.out.println("All negative number is handles here");
        } else if(next != null) {
            System.out.println("Not an negative number hence delegating");
            next.handleRequest(obj);
        }
    }

}
