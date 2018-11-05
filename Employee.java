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
public class Employee extends Person{
    
    private String officeNumber;
    private String officePhoneNumber;
    private String dateOfEmployment;

        
    public Employee(String officeNum, String offPhoNum, String dateOfEmpl, 
            String firstName, String lastName, String phoneNumber, 
            String emailAddress){
        super(firstName, lastName, phoneNumber, emailAddress);
        officeNumber = officeNum;
        officePhoneNumber = offPhoNum;
        dateOfEmployment = dateOfEmpl;
    }
    
    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getOfficePhoneNumber() {
        return officePhoneNumber;
    }

    public void setOfficePhoneNumber(String officePhoneNumber) {
        this.officePhoneNumber = officePhoneNumber;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

     @Override
    public String toString() {
        String ss = super.toString();
        return ss;
    }

    
}
