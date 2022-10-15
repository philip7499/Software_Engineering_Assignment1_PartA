package Software_Eng_Assignment1_Part_A;

public class unitTest {
    Course_Programme compSci;
    Module softwareEng;
    Lecturer michael;
    Student philip;
    
    public unitTest()
    {
        michael=new Lecturer("Michael", "38", "20/01/98", "123987");
        softwareEng=new Module("Software Engineering", "CT417",michael);
        Module[] compSciModules={softwareEng};
        compSci=new Course_Programme("Computer Science and Information Technology", "01/09/22", "28/05/23", compSciModules);
        philip=new Student("Philip", "22", "24/05/00", "19328231", compSci);
        
        System.out.println(michael);
        System.out.println(softwareEng);
        System.out.println(compSci);
        System.out.println(philip);
    }
    
    public static void main(String args[])
    {
        unitTest test=new unitTest();
    }
}
