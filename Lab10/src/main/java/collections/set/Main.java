package collections.set;

import collections.set.service.SetService;

public class Main {

    public static void main(String[] args) {
        SetService setService = new SetService();

        setService.doOperationsOnHashSet();
        setService.doOperationsOnTreeSet();
        setService.doOperationsOnLinkedHashSet();

        setService.doOperationsOnStudentSet();
    }
}
