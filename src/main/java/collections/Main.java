package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] collectionOfNames = {"Ryan","Mikaila","Chung-Li"};
        ArrayList<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Tom");
        names.add("Mark");
        names.add("John");

        //loop through for each loop

        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
       System.out.println("LinkedList: " + animals);
        Iterator<String> iterator = animals.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("========");

        List<Long> list = new ArrayList<>();
        list.add(4L);
        list.add(2L);
        list.add(12L);
        list.add(10L);
        list.add(18L);

        for(Long l : list){
            System.out.println(l);
        }
        Iterator<Long> lit = list.iterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
        }
        ListIterator<Long> listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


        //Creat a treeSet of these 5 numbers: 2,12,10,4,18;
        //Use an iterator to print numbers that are less than 10
        TreeSet<Long> numbers = new TreeSet<>();
        numbers.add(2L);
        numbers.add(12L);
        numbers.add(10L);
        numbers.add(4L);
        numbers.add(18L);
        Iterator<Long> longIterator = numbers.iterator();
        while(longIterator.hasNext()) {
            Long current = longIterator.next();
            if (current < 10) {
                longIterator.remove();
            }
        }
        System.out.println(numbers);

        HashSet<Boolean> isTrueOrFalse = new HashSet<>();
        isTrueOrFalse.add(true);

        Map<Integer,String> wuTangClan = new HashMap<>();
        wuTangClan.put(1,"Rza");
        wuTangClan.put(2,"Gza");
        wuTangClan.put(3,"Inspectah Deck");
        wuTangClan.put(4,"GhostFace");
        for(Map.Entry<Integer,String> entry : wuTangClan.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Iterator<Map.Entry<Integer,String>> iterator1 = wuTangClan.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator1.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }
}
