package DesignPatterns.ChainOfResponsibility;

public class RealHandler2 extends Handler {

    public RealHandler2(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request obj) {
        if(obj.state == 0) {
            System.out.println("All 0 number are handles here");
        } else if(next != null) {
            System.out.println("Number is not 0 number hence delegating forward");
            next.handleRequest(obj);
        }
    }
    

}
