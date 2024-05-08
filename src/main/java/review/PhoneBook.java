package review;

import java.security.Key;
import java.util.*;

public class PhoneBook {

    private Map<String, List<String>> phoneRecord;

    public PhoneBook(){
        this(new HashMap<>());
    }

    public Map<String, List<String>> getPhoneRecord() {
        return phoneRecord;
    }

    public void setPhoneRecord(Map<String, List<String>> phoneRecord) {
        this.phoneRecord = phoneRecord;
    }

    public PhoneBook(Map<String, List<String>> phoneRecord) {
        this.phoneRecord = phoneRecord;
    }

    //Create a method to add a number to the phonebook
    public void add(String name, String phoneNumber){
        List<String> numbers = new ArrayList<>();
        numbers.add(phoneNumber);
        phoneRecord.put(name, numbers);
    }

    //Create a method to addAll Numbers to a phoneRecord
    public void addAll(String name, String... phoneNumbers){
        List<String> numbers = phoneRecord.getOrDefault(name, new ArrayList<>());
        numbers.addAll(Arrays.asList(phoneNumbers));
        phoneRecord.put(name,numbers);
        //put the record in the map by key and values
    }

    //Method to remove a person
    public void remove(String name){
        phoneRecord.remove(name);
        //remove from the map
    }

    //HasEntry - to check if entry exist
    public Boolean hasEntry(String name){
        return phoneRecord.containsKey(name);
    }

    //lookUp(name) - return phone numbers(s)
    public List<String> lookUp(String name){
        List<String> numbers = phoneRecord.get(name);
        if(numbers == null){
            return new ArrayList<>();
        }
        //return a list of phone numbers that belong to the name
        return numbers;
    }

    //reverse lookUp (phoneNumber) - return phone name
    public String reverseLookUp(String phoneNumber){
        //Takes a phone number and returns the name attached to the number
        for(Map.Entry<String, List<String>> entry : phoneRecord.entrySet()){
            if(entry.getValue().contains(phoneNumber)){
             return entry.getKey();
            }
        }
        return "Invalid";
    }

    //Get allContactName in the phoneBook
    public List<String> getAllContactNames(){
        //need a list container to store the names
        List<String> contactNames = new ArrayList<>();
        //need to iterate through the map
        for (Map.Entry<String, List<String>> contacts : phoneRecord.entrySet()){
            //add each name to the list r container
            contactNames.add(contacts.getKey());
        }
        //return the container
        return contactNames;
    }

    //A way to represent the String Obj

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneRecord=" + phoneRecord +
                '}';
    }
}
