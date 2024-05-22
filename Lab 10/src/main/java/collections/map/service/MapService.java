package collections.map.service;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapService {

    Map<Integer, String> hashMap = new HashMap<>();

    Map<Integer, String> treeMap = new TreeMap<>();

    Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

    public void doOperationsOnHashMap() {
        hashMap.put(1, "lion");
        hashMap.put(20, "tiger");
        hashMap.put(12, "cat");
        hashMap.put(17 , "dog");
        String oldValue = hashMap.put(34, "giraffe");
        printValueAdded(oldValue, hashMap.get(34));

        String elementRemoved = hashMap.remove(1);
        System.out.println(elementRemoved);

        boolean result = hashMap.remove(12, "cat");
        System.out.println(result);

        result = hashMap.remove(17, "donkey");
        System.out.println(result);

        System.out.println(hashMap.getOrDefault(17, "Default animal"));
        System.out.println(hashMap.getOrDefault(18, "Default animal"));
    }

    private void printValueAdded(String oldValue, String newValue) {
        if (oldValue == null) {
            System.out.println("FIrst value added to this key is: " + newValue);
        } else {
            System.out.println("Second value added to this key is: "+ newValue + ", before it was: " + oldValue);
        }
    }

    public void doOperationsOnTreeMap() {
        treeMap.put(1, "lion");
        treeMap.put(20, "tiger");
        treeMap.put(12, "cat");
        treeMap.put(17, "dog");

        displayMap(treeMap);
    }

    private void displayMap(Map<Integer, String> map) {
        Set<Integer> keys = map.keySet();

        for (Integer key : keys) {
            System.out.println(key + " - " + map.get(key));
        }
    }

    public void doOperationsOnLinkedHashMap() {
        linkedHashMap.put(1, "lion");
        linkedHashMap.put(20, "tiger");
        linkedHashMap.put(12, "cat");
        linkedHashMap.put(17, "dog");

        displayMap(linkedHashMap);
    }
}
