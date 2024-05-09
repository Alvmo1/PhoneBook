package notes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> groceryList = new ArrayList<>();
        System.out.println(groceryList.size());
        groceryList.add("Eggs");
        groceryList.add("Milk");
        int items = groceryList.size();
        System.out.println(items);
        System.out.println(groceryList.isEmpty());
        System.out.println(groceryList);

        List<Person> peopleInfo = new ArrayList<>();
        Person person = new Person("AL",23);
        Person person1 = new Person("Cory",23);
        peopleInfo.add(person);
        peopleInfo.add(person1);
        for (Person p : peopleInfo){
            System.out.println(p.getName() + " " + p.getAge());
        }
        Map<Integer, Person> peopleRec = new HashMap<>();
        peopleRec.put(1, person);
        peopleRec.put(2, person1);
        for (Map.Entry<Integer, Person> entry : peopleRec.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().getName());
        }
        Iterator<Map.Entry<Integer, Person>> iterator = peopleRec.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Person> entry = iterator.next();
            System.out.println(entry.getKey() + "-" + entry.getValue().getName() + " " + person.getAge());
        }
       // printPeopleNamesOnly(peopleRec);

        Map<String, Double> productInfo = new HashMap<>();
        productInfo.put("Rice",3.99);
        productInfo.put("Milk", 2.50);
        productInfo.put("Chicken",8.00);
        printProductPrices(productInfo);
    }
    public static void printProductPrices(Map<String, Double> productPrices){
        System.out.println("Price for each products");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()){
            System.out.println("$" + entry.getValue());
        }
    }

//    public static void printPeopleNamesOnly(Map<Integer, Person> peopleRecords){
//        for (Map.Entry<Integer, Person> entry : peopleRecords.entrySet()){
//            System.out.println(entry.getValue().getName());
//        }
//    }
}
