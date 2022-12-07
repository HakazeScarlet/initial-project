package data_structures;

import java.util.*;

public class DataStructuresExample {

    public static void main(String[] args) {
        arrayExample();
        listExample();
        stackExample();
        queueExample();
        mapExample();
        setExample();
    }

    private static void setExample() {
        Set<String> set = new HashSet<>();
//        Set<String> tree = new TreeSet<>();
        set.add("Olya");
        set.add("Andrew");
        set.add("Olya");

        for (String str : set) {
            System.out.println(str);
        }
    }

    private static void mapExample() {
        Map<String, Integer> humans = new HashMap<>();
        humans.put("Olya", 27); // entry1
        humans.put("Andrew", 26); // entry2

        System.out.println(humans.get("Olya"));

        for (Map.Entry<String, Integer> entry : humans.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
    }

    private static void queueExample() {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Olya");
        queue.offer("Andrew");
        System.out.println(queue.peek());
    }

    private static void stackExample() {
        List<String> stack = new Stack<>();
        Deque<String> deque = new ArrayDeque<>(); // use instead of stack
    }

    private static void listExample() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(6);

        // 1
        int size = list.size();
        for (int index = 0; index < size; index++) {
            Integer object = list.get(index);
            System.out.println(object);
        }

        // 2 - same as 1 (see 'for loop' above)
        for (Integer object : list) {
            System.out.println(object);
        }

        // you can change implementation depends on task - ArrayList, LinkedList, ...
        List<String> linkedList = new LinkedList<>();
        test(linkedList);
    }

    // work with interface instead implementation
    static void test(List<String> inputList) {
    }

    private static void arrayExample() {
        int[] arr = {10, 20, 30, 40, 60};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 10;
            System.out.println(arr[i]);
        }
    }

    // String ... arr -> 1, 2, 3, 5 => [1, 2, 3, 5]
    // String[] arr -> [1, 2, 3, 5];

    private static void test20221207() {
//        map -> key, value;
//        set -> key;

        Set<Integer> integers = new HashSet<>();
        integers.add(3);

        Set<Integer> tree = new TreeSet<>();


        // -------------------------

        int[][][] arr3 = new int[3][3][3];
        int[][] arr2 = new int[3][3];

        List<List<List<Integer>>> list3 = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();
    }
}
