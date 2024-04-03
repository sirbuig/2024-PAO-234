package interfaces.contract.contractimpl;

import interfaces.contract.contract.Transator;

public class TranslatorEnImpl implements Transator {
    @Override
    public void saySomething(String message) {
        System.out.println("Hello, " + message);
    }
}
