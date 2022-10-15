package Software_Eng_Assignment1_Part_A;

public class Lecturer {
    
    String name;
    String age;
    String DOB;
    String ID;
    String username;
    int noModules;
    Module lecturerModules[]={};
    
    public Lecturer(String name, String age, String DOB, String ID)
    {
        this.name=name;
        this.age=age;
        this.DOB=DOB;
        this.ID=ID;
        noModules=0;
        username=getUsername();
                
    }
    
    public String getUsername()
    {
        username=name.concat(age);
        return username;
    }
    
    public void addModule(Module module)
    {
        noModules+=1;
        Module[] changeOverArray=new Module[noModules];
        
        if (lecturerModules.length>0)
        {
            for (int i=0;i<noModules;i++)
                changeOverArray[i] = lecturerModules[i]; 
            
            changeOverArray[noModules] = module;
        }
        else 
        {
            changeOverArray[0]=module;
        }
        lecturerModules=changeOverArray;
    }
    
    @Override
    public String toString()
    {
        String printString = "Lecturer \nName:" + this.name+"\nAge: " + this.age + "\nDOB: " + this.DOB + "\nID: " + this.ID + "\nUsername: " + this.username + "\nTeacher's Modules (Name): ";
        for (int i=0; i<lecturerModules.length; i++)
        {
            printString+=lecturerModules[i].moduleName;
            if (lecturerModules.length>i+1)
            {
                printString+=", ";
            }
        }
        printString+="\n\n";
        return printString;
    }
    
}
