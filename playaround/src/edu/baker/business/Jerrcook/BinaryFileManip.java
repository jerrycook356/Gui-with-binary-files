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
import java.io.*;
import java.nio.*;
import java.util.ArrayList;

public class BinaryFileManip {
    
    ArrayList<Customer> customers = new ArrayList<>();
    
    public void write()
    {
        try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
           new FileOutputStream("customers.txt"))))
           {
               for(Customer c: customers)
               {
                   out.writeUTF(c.getFirstName());
                   out.writeUTF(c.getLastName());
                   out.writeUTF(c.getPhoneNumber());
               }
               customers.removeAll(customers);
           }
        catch(IOException e)
        {
            System.err.println(e);
        }
        
        
       
                                   
    }
    public ArrayList<Customer> getCustomers()
    {
        try(DataInputStream in = new DataInputStream(
                                     new FileInputStream("customers.txt")))
        {
            while(true)
            {
                String first = in.readUTF();
                String last = in.readUTF();
                String phone = in.readUTF();
                Customer c = new Customer(first,last,phone);
                customers.add(c);
            }
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
        return customers;
    }
    public Customer getCustomer(int i)
    {
        Customer c = customers.get(i);
        return c;   
    }
    public void add(Customer c)
    {
       
        customers.add(c);
        this.write();
              
    }
    public void delete(int i )
    {
        customers.remove(i);
        this.write();
    }
    public void update(int i , Customer c)
    {
        customers.remove(i);
        customers.add(i,c);
        this.write();
    }
}
