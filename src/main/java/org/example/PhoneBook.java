package org.example;

import java.util.TreeMap;

public class PhoneBook {
    TreeMap<String, String> phoneBook = new TreeMap<String, String>();

    public boolean add(String name, String phoneNum) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, phoneNum);
            System.out.println("кол-во контактов: " + phoneBook.size());
            return true;
        }
        System.out.println("Данное имя " + name + " уже есть в книге");
        return false;
    }

    public String findByNumber() {
        return null;
    }

}