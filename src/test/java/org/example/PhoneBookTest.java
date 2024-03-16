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


    // Тесты для метода findByName
    @Test
    public void test_FindByName_FindsCorrectName() {
        phoneBook.add("Alice", "123-456-789");

        var actual = phoneBook.findByName("Alice");

        Assert.assertEquals("Stub and tests for findByName", true, actual);
    }


    @Test
    public void test_FindByName_FindsNotCorrectName() {
        phoneBook.add("Alice", "123-456-789");

        var actual = phoneBook.findByName("Petr");

        Assert.assertNotEquals("Stub and tests for findByName",true, actual);
    }


    // Тесты для метода printAllNames
    @Test
    public void test_PrintAllNamesShowsAllNames_InAlphabeticalOrder() {
        phoneBook.add("Charlie", "321-654-987");
        phoneBook.add("Alice", "123-456-789");
        phoneBook.add("Bob", "987-654-321");

        var actual = phoneBook.printAllNames();

        Assert.assertEquals("Stub and tests for findByName", "Alice, Bob, Charlie", actual);
    }


    @Test
    public void test_PrintAllNamesShowsAllNames_ShouldBeNull() {
        var actual = phoneBook.printAllNames();

        Assert.assertEquals("Stub and tests for findByName","Alice", actual);
    }

}