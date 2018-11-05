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
public class Faculty extends Employee implements Changeable{
    
    private String rank;
    private static final String ASSIS_PROF = "Assistant Professor";
    private static final String ASSOC_PROF = "Associate Professor";
    private static final String PROF = "Professor";
    
    public Faculty(String rank, String officeNum, String offPhoNum, String dateOfEmpl, 
            String firstName, String lastName, String phoneNumber, 
            String emailAddress){
            super(officeNum, offPhoNum, dateOfEmpl,firstName, lastName, 
                    phoneNumber, emailAddress);
            this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public void changeName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        
        String ss = super.toString();
        
        return "Faculty {" + ss + " rank=" + rank + '}';
    }
    
    
}
