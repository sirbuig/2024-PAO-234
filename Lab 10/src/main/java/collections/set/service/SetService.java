package collections.set.service;

import collections.set.domain.Student;

import java.util.*;

public class SetService {

    private final Set<Integer> hashSet = new HashSet<>();

    private final Set<Integer> treeSet = new TreeSet<>();

    private final Set<Integer> linkedHashSet = new LinkedHashSet<>();

    private final Set<Student> studentSet = new TreeSet<>();

    public void doOperationsOnHashSet() {

        boolean result = hashSet.add(11);
        System.out.println(result);

        result = hashSet.add(12);
        System.out.println(result);

        result = hashSet.add(11);
        System.out.println(result);
        System.out.println(hashSet);


        Set<Integer> setInts = Set.of(4, 5, 6, 7);
        List<Integer> listInts = Arrays.asList(45, 11);
        hashSet.addAll(setInts);
        hashSet.addAll(listInts);
        System.out.println(hashSet);

        result = hashSet.remove(11);
        System.out.println(result);

        result = hashSet.remove(11);
        System.out.println(result);

        System.out.println(hashSet.contains(4));
        System.out.println(hashSet);
    }

    public void doOperationsOnTreeSet() {
        treeSet.add(123);
        treeSet.addAll(hashSet);
        treeSet.add(15);

        System.out.println(treeSet);
    }

    public void doOperationsOnLinkedHashSet() {
        linkedHashSet.add(12);
        linkedHashSet.add(44);
        linkedHashSet.add(34);

        System.out.println(linkedHashSet);
    }

    public void doOperationsOnStudentSet() {
        studentSet.add(new Student("Ion", 20));
        studentSet.add(new Student("Gigel", 19));
        studentSet.add(new Student("Marcel", 30));
        System.out.println(studentSet);

        Set<Student> students2 = new TreeSet<>((a, b) -> b.getName().compareTo(a.getName()));
        students2.add(new Student("Ion", 23));
        students2.add(new Student("Gigel", 20));
        students2.add(new Student("Marcel", 30));
        System.out.println(students2);
    }
}
