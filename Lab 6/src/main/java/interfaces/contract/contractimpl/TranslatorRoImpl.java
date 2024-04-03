package interfaces.contract.contractimpl;

import interfaces.contract.contract.Transator;

public class TranslatorRoImpl implements Transator {
    @Override
    public void saySomething(String message) {
        System.out.println("Salut, "+ message);
    }
}
