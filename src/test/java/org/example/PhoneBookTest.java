package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook phoneBookTest = new PhoneBook();

    @AfterEach
    public void clean(){
        phoneBookTest.phoneBook.clear();
    }

    @Test
    public void testAdd() {
        String name = "Alex";
        String phoneNum = "123-123";
        Boolean result = phoneBookTest.add(name, phoneNum);
        Boolean expected = true;
        Assertions.assertSame(expected, result);

    }


    @Test
    public void testFindByNumber() {
        phoneBookTest.add("Alex", "123-123");
        String result = phoneBookTest.findByNumber("123-123");
        String expected = "Alex";
        Assertions.assertSame(expected, result);
    }
}