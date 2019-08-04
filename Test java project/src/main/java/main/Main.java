package main;

import java.util.*;


public class Main {


    public static void main(String[] args) {


// Создаем 3 объекта
// Вызываем метод: Имя(параметры(теже что указаны при создании метода)))

        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        Second sek = new Second(set, list, map);
        sek.getMass();
        System.out.println(map);




      /*  Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 0; i < count; i++) {
            zapolniMap(set(i), list.get(i));
        }*/

    }

//    public static — модификатор;
//    void — возвращаемый тип;
//    methodName — имя метода;
//    ashSet<Integer> set, List<Integer> list, Map map — перечень параметров которые буду использоваться в методе.
}





























/*
Задача:
    создать метод который будет заполнять лист числами
    создаьт метод который будет удалять из этого листа нечетный числа и выводить четные после чего выведет отредактированный лист.


/*Завести сет с 0  до 8
    завести лист со значениями в обратном порядке
завести мапу (цикл по сету в мапу в качестве ключа к соответствующему элементу листа в качестве значения)
вывести мапу
 */











/*
        List<Integer> list = new ArrayList<>();
        list.size();
       /* list.add(putNumbers());


        Set<String> set = new HashSet<>();
        set.add("set");
        Map<String, String> map = new HashMap<>();
        map.put("key", "key");


        List<Integer> numbers = new ArrayList<>();



            for(String value : list.add()){
             System.out.println(value);
         }



//    // создает лист "numbers" с номерами от 1 до 10
//    private static void putNumbers(List<Integer> numbers) {
//        for (int i = 0; i < count; i++) {
//            numbers.add(i);
//        }
//    }
//
//    private static void del(List<Integer> numbers) {
//        for (int i = 0; i < count; i++) {
//            numbers.add(i);
//        }
//    }
 */


