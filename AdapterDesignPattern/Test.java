package DesignPatterns.AdapterDesignPattern;

public class Test {
    
    public static void main(String[] args) {
        
        EmployeeDetails ed = new EmployeeDetails();
        EmployeeToPLAdapter adapter = new EmployeeToPLAdapter(ed);
        Interanet interanet = new Interanet(adapter);
        
        interanet.printPhoneNumbers();

    }

}
