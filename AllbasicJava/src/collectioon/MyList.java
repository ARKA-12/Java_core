package collectioon;

import java.util.*;

public class MyList {
    public static void main(String[] args) {
        //[][][][][][][][][][][][][][][][][]
        List<Integer> list = new ArrayList<>();//[][][][]
        List<Integer>linkedList = new LinkedList<>();//[]->[]->[]->[]
        list.add(1);
        linkedList.add(2);

        Set<Integer> set = new HashSet<>();//unordered set
        Set<Integer> set1 = new LinkedHashSet<>();// ordered set
        Set<Integer>set2 = new TreeSet<>();//sorted set

        set.add(1);
        set.add(1);

        System.out.println(set.contains(1));

        Map<Integer,Integer> map = new HashMap<>(); //Unordered Map
        Map<Integer,Integer> map1 = new LinkedHashMap<>();//Ordered Map
        Map<Integer,Integer> map2 = new TreeMap<>();// Sorted Map

        map.put(1,2);

        Queue<Integer> q = new LinkedList<>(); // DLL(dobly linked list)
        Queue<Integer> q1 = new PriorityQueue<>(); // heap
        Queue<Integer> q2 = new ArrayDeque<>();//circular queue(double ended queue)
        q.poll();
        q.add(1);
        q.offer(5);
        q.size();
        q.isEmpty();
        q.peek();

    }
}
