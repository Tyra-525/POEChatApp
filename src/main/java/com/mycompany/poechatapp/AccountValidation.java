/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poechatapp;

/**
 *
 * @author tyraz
 */
public class AccountValidation {
    public class AccountValidation {
   public String name;
   public String username; 
   public String password;
   public String cellPhoneNumber;
//Getters
public AccountValidation(){}
public String getName(){return name;}
public String getUsername(){return username;}
public String getPassword(){return password;}
public String getCellPhoneNumber(){return cellPhoneNumber;}

 

//method for name
public boolean name(String name){ //if theres a problem its because you exlcded the name cannot be empty 
if (!name.trim().matches("[ a-zA-Z]+")){
System.out.println("First name must contain letters or numbers");
return false;
}
this.name = name.trim();
return true;
}

}
