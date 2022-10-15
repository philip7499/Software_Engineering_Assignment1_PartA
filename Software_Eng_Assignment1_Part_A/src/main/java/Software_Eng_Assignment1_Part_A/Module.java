package Software_Eng_Assignment1_Part_A;

public class Module {
    
    String moduleName;
    String moduleID;
    Student students[]={};
    Course_Programme course;
    Lecturer lecturer;
    int noStudents;
    
    public Module(String moduleName, String moduleID, Lecturer lecturer)
    {
        this.moduleName=moduleName;
        this.moduleID=moduleID;
        this.lecturer=lecturer;
        lecturer.addModule(this);
        noStudents=0;
        
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
    
    @Override
    public String toString()
    {
        String printString = "Module \nName:" + this.moduleName+"\nModule ID " + this.moduleID + "\nModule Lecturer: " + this.lecturer.name + "\nCourse Students (name): ";
        for (int i=0; i<students.length; i++)
        {
            printString+=students[i].name;
            if (students.length>i+1)
            {
                printString+=", ";
            }
        }
        printString+="\nModule Courses: " + course.courseName;
        printString+="\n\n";
        return printString;
    }
 
}
