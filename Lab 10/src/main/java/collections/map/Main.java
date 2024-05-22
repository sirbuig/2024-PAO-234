package collections.map;

import collections.map.service.MapService;

public class Main {

    public static void main(String[] args) {
        MapService mapService = new MapService();

        System.out.println("HashMap:");
        mapService.doOperationsOnHashMap();
        mapService.doOperationsOnTreeMap();
        mapService.doOperationsOnLinkedHashMap();
    }
}
