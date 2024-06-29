package collections.list;

import collections.list.service.ListService;

public class Main {

    public static void main(String[] args) {

//        List objects = new ArrayList();
//        objects.add(1);
//        objects.add("Element");
//        objects.add(new Object());
//
//        System.out.println(objects);
//        for (Object o : objects) {
//            System.out.println(o);
//        }

        ListService service = new ListService();
        //service.doOperationsOnArrayList();
        //service.convertArraysToList();
        //service.doOperationsOnLinkedList();
        service.showCollections();
    }
}
