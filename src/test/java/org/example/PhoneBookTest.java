package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PhoneBookTest {

    // Initial commit

    private PhoneBook phoneBook;

    @BeforeEach
    void setup() {
        phoneBook = new PhoneBook();
    }

    // Тесты для добавления метода нового контакта
    @Test
    public void test_AddContact_ShouldReturn_True() {
        var actual = phoneBook.add("Alice", "123-456-789");

        Assert.assertEquals("Stub and tests for add", 1, actual);
    }


    @Test
    public void test_AddContact_ShouldReturn_False() {
        phoneBook.add("Alice", "123-456-789");

        var actual = phoneBook.add("Alice", "123-456-789");

        Assert.assertNotEquals("Stub and tests for add", 1, actual);
    }

    // Тесты для метода findByNumber
    @Test
    public void test_FindByNumber_FindsCorrectName() {
        phoneBook.add("Alice", "123-456-789");

        var actual = phoneBook.findByNumber("123-456-789");
        var expected = "Alice";

        Assert.assertEquals("Stub and tests for findByNumber", expected, actual);
    }


    @Test
    public void test_FindByNumber_FindsNotCorrectName() {
        phoneBook.add("Alice", "123-456-789");

        var actual = phoneBook.findByNumber("123-456-789");
        var expected = "Petr";

        Assert.assertNotEquals("Stub and tests for findByNumber", expected, actual);
    }
}