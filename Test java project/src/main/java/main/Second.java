package main;

import java.util.*;

public class Second {

    // Создаем 3 объекта
    private Set<Integer> set;
    private List<Integer> list;
    private Map<Integer, Integer> map;

    Second (Set<Integer> set, List<Integer> list, Map<Integer, Integer> map){
        this.set = set;
        this.list = list;
        this.map = map;
    }

    public void getMass(){
        for (int i = 0; i <= 10; i++) {
            set.add(i);
            list.add(10 - i);
        }
        int k = 0;
        for (Integer i : set) {
            map.put(i, list.get(k));
            k++;
        }
    }

}


//    /public static void zapolniSet(HashSet<Integer> set, List<Integer> list, Map map) {
//        for (int i = 0; i <= count; i++) {
//            set.add(i);
//            list.add(10-i);
//        }
//        int k = 0;
//        for(Integer i : set){
//            map.put(i, list.get(k));
//            k++;
//        }
//    }