package DesignPatterns.ChainOfResponsibility;

public abstract class Handler {
    
    protected Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    // method can have aby kind of return type
    public abstract void handleRequest(Request obj);

}
