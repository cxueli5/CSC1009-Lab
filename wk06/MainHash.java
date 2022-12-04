import java.util.*;
import java.util.Map.Entry;
import java.util.LinkedHashMap;

class MainHash {
    public static void main(String args[]){
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<Integer, Integer>();
        hashMap.put(0,1);
        hashMap.put(1,3);
        hashMap.put(2,5);
        hashMap.put(3,11);
        hashMap.put(4,7);
        hashMap.put(5,9);

        System.out.println("Linked List before addAndSort");
        List<Entry<Integer, Integer>> linkedListFormat = new LinkedList<Entry<Integer, Integer>>(hashMap.entrySet());
        for (Entry<Integer, Integer> element: linkedListFormat){
            System.out.println(element);
        }

        System.out.println("Linked List after addAndSort");
        addAndSort(hashMap, 15);

        System.out.println("Linked List before swap");
        for (Entry<Integer, Integer> element: linkedListFormat){
            System.out.println(element);
        }

        System.out.println("Linked List after swap");
        swap(hashMap, 3, 11);
    }

    public static void addAndSort(LinkedHashMap<Integer, Integer> linkHashMap, int val){
        linkHashMap.put(linkHashMap.size(), val);
        List<Entry<Integer, Integer>> list = new LinkedList<Entry<Integer, Integer>>(linkHashMap.entrySet());
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2){
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Entry<Integer, Integer> item: list){
            System.out.println(item);
        }
    }

    public static void swap(LinkedHashMap<Integer, Integer> linkHashMap, int ele1, int ele2){
        List<Entry<Integer, Integer>> list = new LinkedList<Entry<Integer, Integer>>(linkHashMap.entrySet());
        for (Entry<Integer, Integer> item: list){
            if(item.getValue() == ele1){
                item.getKey();
                item.setValue(ele2);
            }else if(item.getValue() == ele2){
                item.getKey();
                item.setValue(ele1);
            }
        }
        for (Entry<Integer, Integer> item: list){
            System.out.println(item);
        }
    }
}