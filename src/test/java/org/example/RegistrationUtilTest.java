package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrationUtilTest {
    RegistrationUtil infoUser;

    @BeforeEach
    void setup(){
        infoUser = new RegistrationUtil();
    }

    @Test
    void test_registrationUtil_isEmpty(){
        assertFalse(infoUser.validateUserInput("", "", ""));
    }

    @Test
    void test_registrationUtil_notConformPassword(){
        assertFalse(infoUser.validateUserInput("tigerhood", "azerty", "qwerty"));
    }

    @Test
    void test_registrationUtil_allValidate(){
        assertTrue(infoUser.validateUserInput("tigerhood", "azerty", "azerty"));
    }
}
