package DesignPatterns.ChainOfResponsibility;

public class Test {
    public static void main(String[] args) {
        Handler h1 = new RealHandler1(null);
        Handler h2 = new RealHandler2(h1);
        Handler h3 = new RealHandler3(h2);

        Request obj = new Request();
        obj.state = 10;

        h3.handleRequest(obj);
    }
}
