/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuniversity;

import java.util.ArrayList;

/**
 *
 * @author hrai36
 */
public class SimUniversity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Faculty prof1 = new Faculty("Assistant Professor", "415C", 
                "555-2345", "10/2013", "Joseph", "Roberts", "484-455-6745", 
                "jroberts@uni.edu");
        Faculty prof2 = new Faculty("Associate Professor", "205B", 
                "555-2178", "01/2002", "Mary", "Johnson", "484-669-8643", 
                "mjohnson@uni.edu");
        Faculty prof3 = new Faculty("Professor", "130A", 
                "555-3349", "04/2007", "Ann", "Doe", "484-987-8216", 
                "adoe@uni.edu");
        
        Student stu1 = new Student("Freshman", "Michael", "Gonzalez", 
            "484-745-9002", "mgonzalez@uni.edu");
        Student stu2 = new Student("Sophomore", "Rachel", "Song", 
            "484-887-4813", "rsong@uni.edu");
        Student stu3 = new Student("Junior", "Matthew", "Prescott", 
            "484-109-3298", "mprescott@uni.edu");
        
        Staff staff1 = new Staff("Registrar Manager", "200", "555-1974", 
            "12/2015", "Debra", "Howard", 
            "484-386-9176", "dhoward@uni.edu");
        Staff staff2 = new Staff("Labratory Technician", "505", "555-9502", 
            "12/2015", "Steven", "Kendricks", 
            "484-745-1119", "skendricks@uni.edu");
        Staff staff3 = new Staff("Tutor", "1118", "555-9045", 
            "05/2010", "John", "Riley", 
            "484-116-0676", "jriley@uni.edu");
        
        ArrayList<Faculty> faculty = new ArrayList<Faculty>();
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Staff> staff = new ArrayList<Staff>();
        
        faculty.add(prof1);
        faculty.add(prof2);
        faculty.add(prof3);
        
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        
        staff.add(staff1);
        staff.add(staff2);
        staff.add(staff3);
        
        
        for(Faculty i : faculty){
            
            System.out.println(i.toString());
        }
        
        for(Student i : students){
            
            System.out.println(i.toString());
        }
        
        for(Staff i : staff){
            
            System.out.println(i.toString());
        }
        
        stu1.changeName("Jordan", "Gonzalez");
        
        System.out.println("Student name changed for student1: " + 
                stu1.toString());
    }
    
   
    
}

/* Output

Faculty {firstName=Joseph, lastName=Roberts} rank=Assistant Professor}
Faculty {firstName=Mary, lastName=Johnson} rank=Associate Professor}
Faculty {firstName=Ann, lastName=Doe} rank=Professor}
Student {firstName=Michael, lastName=Gonzalez} classStatus=Freshman}
Student {firstName=Rachel, lastName=Song} classStatus=Sophomore}
Student {firstName=Matthew, lastName=Prescott} classStatus=Junior}
Staff {firstName=Debra, lastName=Howard} title=Registrar Manager}
Staff {firstName=Steven, lastName=Kendricks} title=Labratory Technician}
Staff {firstName=John, lastName=Riley} title=Tutor}
Student name changed for student1: Student {firstName=Jordan, lastName=Gonzalez} classStatus=Freshman}

*/