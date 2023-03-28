package DesignPatterns.AdapterDesignPattern;

import java.util.List;

public class Interanet {
    IPhoneListSource source;

    public Interanet(IPhoneListSource source) {
        this.source = source;
    }

    public void printPhoneNumbers() {
        List<String> phones = this.source.GetPhoneNumbers();
        System.out.println(phones);
    }
}
