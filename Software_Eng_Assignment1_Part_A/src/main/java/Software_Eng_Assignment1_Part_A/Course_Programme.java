package Software_Eng_Assignment1_Part_A;
import java.text.SimpleDateFormat;

/**
 *
 * @author Philip
 */
public class Course_Programme {
    
    String courseName;
    Module modules[];
    Student students[]={};
    java.util.Date startDate;
    java.util.Date endDate;
    int noStudents;
    
    
    public Course_Programme(String courseName, String startDate, String endDate, Module[] modules)
    {
        this.courseName=courseName;
        try{
        this.startDate=new SimpleDateFormat("dd/MM/yyyy").parse(startDate);
        this.endDate=new SimpleDateFormat("dd/MM/yyyy").parse(endDate);
        }
        catch(Exception e)
        {}
        this.modules=modules;
        addCourseToModules();
        noStudents=0;
                
    }
    
    public void addCourseToModules()
    {
        for (int i=0; i<modules.length; i++)
        {
            modules[i].course=this;
        }
    }
    
    public void addStudent(Student student)
    {
        noStudents+=1;
        Student[] changeOverArray=new Student[noStudents];
        
        if (students.length>0)
        {
            for (int i=0;i<noStudents;i++)
                changeOverArray[i] = students[i]; 
            
            changeOverArray[noStudents] = student;
        }
        else 
        {
            changeOverArray[0]=student;
        }
        students=changeOverArray;
    }
    
    public Module[] getModules()
    {
        return modules;
    }
    
    public int noModules()
    {
        return modules.length;           
    }
    
    @Override
    public String toString()
    {
        String printString = "Course \nName:" + this.courseName+"\nStart Date: " + this.startDate + "\nEnd Date: " + this.endDate + "\nCourse Students (name): ";
        if (students.length>0)
        {
            for (int i=0; i<students.length; i++)
            {
                printString+=students[i].name;
                if (students.length>i+1)
                {
                   printString+=", ";
                }
            
            }
            
        }
        else
        {
            printString+="No students in Course";
        }
        
        printString+="\nCourse Modules: ";
        if (modules.length>0)
        {
            for (int i=0; i<modules.length; i++)
            {
                printString+=modules[i].moduleName;
                if (modules.length>i+1)
                {
                    printString+=", ";
                }
            
            }
        }
        else
        {
            printString+="No modules in Course";
        }
        printString+="\n\n";
        return printString;
    }
    
}
