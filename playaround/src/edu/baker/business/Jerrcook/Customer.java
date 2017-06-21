package edu.baker.business.Jerrcook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerry
 */
public class Customer {
    
    String firstName;
    String lastName;
    String phoneNumber;
    
   public  Customer(String firstName, String lastName, String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
}    
