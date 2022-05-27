package br.com.guifr.hackerrank.preparationkit.threemonth.weekfive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StrongPasswordTest {

    @Test
    @DisplayName("Return 2 When validate password is fail because long /uppercase and special character With '2bbbb'")
    public void test1() {
        int actual = StrongPassword.validate("2bbbb");
        Assertions.assertEquals(2,actual);
    }

    @Test
    @DisplayName("Return 1 When validate password is strong but fail 1 to have 6 length With '2bb#A'")
    public void test2() {
        int actual = StrongPassword.validate("2bb#A");
        Assertions.assertEquals(1,actual);
    }

    @Test
    @DisplayName("Return true When search s has number With '2bbbb'")
    public void testHasNumber1() {
        Assertions.assertTrue(StrongPassword.hasNumber("2bbbb"));
    }

    @Test
    @DisplayName("Return false When search s don't have number With 'bbbb'")
    public void testHasNumber2() {
        Assertions.assertFalse(StrongPassword.hasNumber("bbbb"));
    }

    @Test
    @DisplayName("Return true When search s has LowerCase With '2bbbb'")
    public void testHasLowerCase1() {
        Assertions.assertTrue(StrongPassword.hasLowerCase("2bbbb"));
    }

    @Test
    @DisplayName("Return false When search s don't have LowerCase With 'bbbb'")
    public void testHasLowerCase2() {
        Assertions.assertFalse(StrongPassword.hasLowerCase("2BBBB"));
    }

    @Test
    @DisplayName("Return true When search s has UpperCase With '2bbbb'")
    public void testHasUpperCase1() {
        Assertions.assertTrue(StrongPassword.hasUpperCase("2bbbbB"));
    }

    @Test
    @DisplayName("Return false When search s don't have UpperCase With 'bbbb'")
    public void testHasUpperCase2() {
        Assertions.assertFalse(StrongPassword.hasUpperCase("2aaaaa"));
    }

    @Test
    @DisplayName("Return true When search s has special_characters  With '2bbbb'")
    public void testHasSpecial1() {
        Assertions.assertTrue(StrongPassword.hasSpecial("2bbbbB@"));
    }

    @Test
    @DisplayName("Return false When search s don't have special_characters  With 'bbbb'")
    public void testHasSpecial2() {
        Assertions.assertFalse(StrongPassword.hasSpecial("2aaaaa"));
    }

    @Test
    @DisplayName("Return 2 When calculate how much lack to 6 With 'bbbb'")
    public void testMissingTo2() {
        Assertions.assertEquals(2,StrongPassword.missingLengthTo("bbbb",6));
    }

}