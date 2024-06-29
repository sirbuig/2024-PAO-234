package collections.list.service;

import java.util.*;

public class ListService {

    private final List<String> names = new ArrayList<>();
    private final List<Integer> numbers = new LinkedList<>();

    public void doOperationsOnArrayList() {
        System.out.println(names.isEmpty());

        // add at the end of the list
        names.add("Paula");
        names.add("Ana");

        //add at a particular index
        names.add(0, "Teo");


        List<String> otherNames = new ArrayList<>();
        List<String> otherNames2 = new ArrayList<>(names);
        List<String> otherNames3 = new ArrayList<>(30);

        otherNames.add("Maria");
        otherNames.add("John");

        // names.addAll(otherNames);
        names.addAll(1, otherNames);

        names.add("Teo");

        System.out.println(names.indexOf("Teo"));
        System.out.println(names.lastIndexOf("Teo"));

        System.out.println(names.indexOf("Ana"));
        System.out.println(names.lastIndexOf("Ana"));

        System.out.println(names.indexOf("Marius")); // returns -1, because it doesn't exist

        System.out.println("---------");
        displayList();
        System.out.println("---------");
        anotherDisplayList();
        System.out.println("---------");
        oneMoreDisplayList();

        List<String> subList = names.subList(1, 4);
        System.out.println(subList);

        names.set(0, "Dana");
        System.out.println(names.get(0));

        String name = names.remove(0);
        System.out.println(name);
        boolean result = names.remove("John");
        System.out.println(result);
        displayList();

        System.out.println(names.contains("Ana"));
        names.removeAll(otherNames);
        displayList();

        names.clear();
        System.out.println(names.size());
        System.out.println(names);
    }

    private void displayList() {
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private void anotherDisplayList() {
        for (String name : names) {
            System.out.println(name);
        }
    }

    private void oneMoreDisplayList() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }

    public void convertArraysToList() {
        Integer[] array = {11, 12, 13, 14, 15};
        array[0] = 456;

        List<Integer> ints = List.of(array);

        //ints.set(2, 98);
        //ints.remove(456);

        System.out.println(ints);

        Integer[] array2 = {2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.asList(array2);
        array2[0] = 11;
        list.set(1, 25);
        //list.add(123); //UnsupportedOperationException

        System.out.println(Arrays.toString(array2));
        System.out.println(list);
    }

    public void doOperationsOnLinkedList() {
        Deque<String> deque = new ArrayDeque<>();
        LinkedList<String> list = new LinkedList<>();

        names.add("New Name");
        names.add("Another Name");

        list.add("abc");
        list.add(0, "cd");
        list.addFirst("aa");
        list.addLast("bbb");
        System.out.println(list);

        String e1 = list.removeFirst();
        String e2 = list.removeLast();

        list.addAll(names);
        list.removeFirstOccurrence("cd");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);
    }

    public void showCollections() {
        List<String> otherNames = new ArrayList<>();

        otherNames.add("Maria");
        otherNames.add("Ana");
        otherNames.add("Dana");

        Collections.sort(otherNames);
        System.out.println(otherNames);

        System.out.println(Collections.binarySearch(otherNames, "Maria"));
        System.out.println(Collections.binarySearch(otherNames, "Mariana"));
        System.out.println(Collections.binarySearch(otherNames, "Daniela"));

        Collections.sort(otherNames, Collections.reverseOrder());
        System.out.println(otherNames);

        Collections.shuffle(otherNames);
        System.out.println(otherNames);
        Collections.shuffle(otherNames);
        System.out.println(otherNames);
        Collections.shuffle(otherNames);
        System.out.println(otherNames);
    }
}
