/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuniversity;

/**
 *
 * @author hrai36
 */
public abstract class Person {
    
    protected String firstName;
    protected String lastName;
    private String phoneNumber;
    private String emailAddress;
    
    public Person(String fName, String lName,String pNumber, String eAddress){
    
        firstName = fName;
        lastName = lName;
        phoneNumber = pNumber;
        emailAddress = eAddress;
        
    }
    
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmailAddress(){
        return emailAddress;
    }
    
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
    
    
    
}
