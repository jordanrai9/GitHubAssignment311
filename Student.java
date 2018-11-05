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
public class Student extends Person implements Changeable{
    
    private String classStatus;
    private static final String FRESHMEN = "Freshman";
    private static final String SOPHOMORE = "Sophomore";
    private static final String JUNIOR = "Junior";
    private static final String SENIOR = "Senior";
    
    public Student(String classStatus, String firstName, String lastName, 
            String phoneNumber, String emailAddress){
        super(firstName, lastName, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }
    
    String getClassStatus(){
        return classStatus;
    }
    
    public void setClassStatus(String classStatus){
        if(classStatus == "Freshman"){
            this.classStatus = FRESHMEN;
        }
        else if(classStatus == "Sophomore"){
            this.classStatus = SOPHOMORE;
        }
        else if(classStatus == "Junior"){
            this.classStatus = JUNIOR;
        }
        else if(classStatus == "Senior"){
            this.classStatus = SENIOR;
        }
    }
    
    public void changeName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        String ss = super.toString();
        return "Student {" + ss + " classStatus=" + classStatus + '}';
    }
    

    
}
