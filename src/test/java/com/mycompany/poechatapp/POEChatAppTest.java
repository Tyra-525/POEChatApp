/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poechatapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tyraz
 */
public class POEChatAppTest {
    AccountValidation obj = new AccountValidation();
    public POEChatAppTest() {
    }
@BeforeEach
void setUp(){
 obj = new AccountValidation();
}
    @Test
    public void testValidName() {
        assertTrue(obj.name("Tyra"));
        assertEquals("Tyra",obj.getName());
    }
     @Test
    void testInvalidNameWithNumbers() {
        assertFalse(obj.name("John123"));
    }

    @Test
    void testInvalidNameWithSpecialCharacters() {
        assertFalse(obj.name("John!"));
    }
    
 //username test
     @Test
    void testValidUsername() {
        assertTrue(obj.checkUsername("john_doe"));
        assertEquals("john_doe", obj.getUsername());
    }

    @Test
    void testUsernameTooShort() {
        assertFalse(obj.checkUsername("jo_"));
    }

    @Test
    void testUsernameMissingUnderscore() {
        assertFalse(obj.checkUsername("johndoe"));
    }
    
 //check password
 @Test
    void testValidPassword() {
        assertTrue(obj.checkPassword("Passw0rd!"));
        assertEquals("Passw0rd!", obj.getPassword());
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(obj.checkPassword("Pas1!"));
    }

    @Test
    void testPasswordMissingCapital() {
        assertFalse(obj.checkPassword("password1!"));
    }
     @Test
    void testPasswordMissingNumber() {
        assertFalse(obj.checkPassword("Password!"));
    }

    @Test
    void testPasswordMissingSpecialChar() {
        assertFalse(obj.checkPassword("Password1"));
    }
}
