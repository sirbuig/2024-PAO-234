package interfaces.contract;

import interfaces.contract.contract.Transator;
import interfaces.contract.contractimpl.TranslatorEnImpl;
import interfaces.contract.contractimpl.TranslatorRoImpl;

public class Main {
    public static void main(String[] args) {
        Transator eng = new TranslatorEnImpl();
        Transator ro = new TranslatorRoImpl();

        eng.saySomething("world");
        ro.saySomething("lume");
    }
}
