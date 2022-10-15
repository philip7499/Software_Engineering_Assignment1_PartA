package Software_Eng_Assignment1_Part_A;

public class Student {
    
    String name;
    String age;
    String DOB;
    String ID;
    String username;
    Module studentModules[];
    Course_Programme studentCourse;
    int noModules;
    
    public Student(String name, String age, String DOB, String ID, Course_Programme studentCourse)
    {
        this.name=name;
        this.age=age;
        this.DOB=DOB;
        this.ID=ID;
        this.studentCourse=studentCourse;
        username=getUsername();
        noModules=0;
        studentModules=studentCourse.getModules();
        addStudentToModule(studentModules);      
        studentCourse.addStudent(this);
    }
    
     public void addStudentToModule(Module[] modules)
    {
        noModules=modules.length;
        
        for (int i=0;i<noModules;i++) 
            modules[i].addStudent(this);
   
    }
    
    public String getUsername()
    {
        username=name.concat(age);
        return username;
    }
    
    @Override
    public String toString()
    {
        String printString = "Student \nName:" + this.name+"\nAge: " + this.age + "\nDOB: " + this.DOB + "\nID: " + this.ID + "\nUsername: " + this.username + "\nStudent's Course (Name): " + this.studentCourse.courseName + "\nStudent's Modules (Name): ";
        for (int i=0; i<studentModules.length; i++)
        {
            printString+=studentModules[i].moduleName;
            if (studentModules.length>i+1)
            {
                printString+=", ";
            }
        }
        printString+="\n\n";
        return printString;
    }
    
}
