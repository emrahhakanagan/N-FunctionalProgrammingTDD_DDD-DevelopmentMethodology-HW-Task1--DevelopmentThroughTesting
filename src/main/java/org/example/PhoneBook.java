package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PhoneBook {

    private final Map<String, String> contacts = new HashMap<>();

    public int add(String name, String number) {
        // Проверяем, существует ли уже такое имя в мапе
        if (contacts.getOrDefault(name, null) != null) {
            // Имя уже существует, возвращаем 0
            return 0;
        } else {
            // Имя не существует, добавляем контакт и возвращаем 1
            contacts.put(name, number);
            return 1;
        }
    }
// add method implemented

    public String findByNumber(String number) {
        return contacts.entrySet().stream()
                .filter(entry -> entry.getValue().equals(number))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
// findByNumber method implemented

    public Boolean findByName(String name) {
        return contacts.containsKey(name);
    }
// findByName method implemented


    public String printAllNames() {
        if (!contacts.isEmpty()) {
            return contacts.keySet().stream()
                    .sorted()
                    .collect(Collectors.joining(", "));
        }

        return null;
    }
// printAllNames method implemented

}