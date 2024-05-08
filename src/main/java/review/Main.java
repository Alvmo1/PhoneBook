package review;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Joel","302-222-9279");
        phoneBook.add("Maria","302-342-2321");
        phoneBook.add("John","302-453-6654");
        for(Map.Entry<String, List<String>> entry : phoneBook.getPhoneRecord().entrySet()){
            String name = entry.getKey();
            List<String> numbers = entry.getValue();
            for(String number : numbers){
                System.out.println(name + ": " + number);
            }
        }
        phoneBook.addAll("Jay","424-534-5345","424-242-5666");
        System.out.println(phoneBook.lookUp("Jay"));
        phoneBook.remove("Maria");
        System.out.println(phoneBook.hasEntry("John"));
        System.out.println(phoneBook.lookUp("Joel"));
        System.out.println(phoneBook.reverseLookUp("302-222-9279"));
        System.out.println(phoneBook.getAllContactNames());

    }
}
