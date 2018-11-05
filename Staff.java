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
public class Staff extends Employee{
    
    private String title;
    
    public Staff(String title, String officeNum, String offPhoNum, 
            String dateOfEmpl, String firstName, String lastName, 
            String phoneNumber, String emailAddress){
            super(officeNum, offPhoNum, dateOfEmpl,firstName, lastName, 
                    phoneNumber, emailAddress);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        String ss = super.toString();
        return "Staff {" + ss+  " title=" + title + '}';
    }
    
    
}
