package review;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @Test
    void addAllTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addAll("Jojo", "302-930-3333");
        phoneBook.addAll("Lee", "232-255-7654");
        List<String> expected = new ArrayList<>();
        expected.add("302-930-3333");
        expected.add("232-255-7654");
        List<String> actual = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : phoneBook.getPhoneRecord().entrySet()){
            actual.addAll(entry.getValue());
        }
        assertEquals(expected, actual);
    }

    @Test
    void removeTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Jod", "302-312-3111");
        phoneBook.add("Jake", "302-242-0024");
        phoneBook.remove("Jake");
        boolean expected = true;
        boolean actual = phoneBook.hasEntry("Jod");
        assertEquals(expected, actual);
    }

    @Test
    void reverseLookUpTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Zoey", "302-543-5533");
        String expected = "Zoey";
        String phoneNumber = "302-543-5533";
        String actual = expected;
        assertEquals(expected, actual);
    }
    @Test
    void PhoneBookTest(){
        PhoneBook phoneBook = new PhoneBook();
        assertTrue(phoneBook.getPhoneRecord() instanceof HashMap<String, List<String>>);
    }
}