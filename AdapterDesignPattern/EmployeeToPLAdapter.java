package DesignPatterns.AdapterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeToPLAdapter implements IPhoneListSource {

    private EmployeeDetails empDS;

    public EmployeeToPLAdapter(EmployeeDetails empDS) {
        this.empDS = empDS;
    }
    
    @Override
    public List<String> GetPhoneNumbers() {
        List<String> emps = this.empDS.getEmployees();
        List<String> phoneNumbers = new ArrayList<>();

        for(String emp : emps) {
            String[] parts = emp.split("-");
            phoneNumbers.add(parts[3]);
        }

        return phoneNumbers;
    }
    
}
