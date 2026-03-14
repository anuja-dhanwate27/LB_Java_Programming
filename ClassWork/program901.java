import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;


// Done
class StudyLog
{
    private LocalDate Date;
    private String Subject;
    private double Duration;
    private String Description;
   
    public StudyLog(LocalDate a , String b ,double c , String d)
    {
        this.Date = a;
        this.Subject = b;
        this.Duration = c;
        this.Description = d;

    }

    public LocalDate getDate()
    {
        return this.Date;
    }

    public String getSubject()
    {
        return this.Subject;
    }

    public double getDuration()
    {
        return this.Duration;
    }

    public String getDescription()
    {
        return this.Description;
    }

    @Override
    public String toString()
    {
        return Date+" | "+Subject+" | "+Duration+" | "+Description;
    }

}

class StudyTracker
{
    public ArrayList <StudyLog> Database = new ArrayList<StudyLog>();

    public void InsertLog()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("-------------Enter Valid Details of your study-------------");
        System.out.println("-----------------------------------------------------------");

        LocalDate lobj = LocalDate.now();
        System.out.println("Please Enter the name of Subject like c/c++/java/python");
        String sub = sobj.nextLine();

        System.out.println("Enter the time period of your study in hourse");
        double dur = sobj.nextDouble();
        sobj.nextLine();

        System.out.println("Please provide the description of your study");
        String desc = sobj.nextLine();

        StudyLog studyobj = new StudyLog(lobj, sub, dur, desc);

        Database.add(studyobj);
        System.out.println("Study log gets stored succesfully");
        System.out.println("-----------------------------------------------------------");

    }

    public void DisplayLog()
    {
       System.out.println("-----------------------------------------------------------");
       if(Database.isEmpty())
       {
           System.out.println("----------------Noting to Display----------------------");
           System.out.println("-------------------------------------------------------");
           return;
       }
       System.out.println("----------Log report of marvellous Study Tracker------------");
       System.out.println("-----------------------------------------------------------");

       for(StudyLog s : Database)
       {
          System.out.println(s);
       }

       System.out.println("-----------------------------------------------------------");

        
    }

    public void ExportCSV()
    {

      if(Database.isEmpty())
       {
           System.out.println("-------------------------------------------------------");
           System.out.println("----------------Noting to export-----------------------");
           System.out.println("-------------------------------------------------------");
           return;
       }

       String FileName = "MarvellousStudyTracker.csv";

       try(FileWriter fwobj = new FileWriter(FileName))
       {
          fwobj.write("Data , Subject , Duration , Description\n");

          for(StudyLog s : Database)
          {
             fwobj.write(s.getDate()+","+
                         s.getSubject().replace(","," ")+","+
                         s.getDuration()+","+
                         s.getDescription().replace(","," ")+"\n");
          }

          System.out.println("Data gets exported in csv : "+FileName);
           
       }
       catch(Exception eobj)
       {
          System.out.println("Exception occured in csv handling");
       }

       
    }


    public void SummaryByDate()
    {
       
    }

    public void SummaryBySubject()
    {

        System.out.println("-------------------------------------------------------");
        if(Database.isEmpty())
        {
            System.out.println("Noting to Display as database is empty");
            System.out.println("-------------------------------------------------------");
            return;
        }


        System.out.println("----------Summary By Subject from Study Tracker--------");
        
        System.out.println("-------------------------------------------------------");


        TreeMap <String , Double> tobj = new TreeMap<String , Double>();
        
        String s = null;
        Double d = 0.0 , old = 0.0;


        
        for(StudyLog sobj : Database)
        {
           s = sobj.getSubject();
           d = sobj.getDuration();

           if(tobj.containsKey(s))
           {
               old = tobj.get(s);
               tobj.put(s,d+old);

             
           }
           else
           {
             tobj.put(s,d);
           }
        }

        // Display the details as per subject 
        for(String str : tobj.keySet())
        {
            System.out.println("Subject : "+str+"Total study duration : "+tobj.get(str));
        }

        System.out.println("-------------------------------------------------------");
        
    }

}

class program901
{
    public static void main(String A[]) 
    { 

        Scanner sobj = new Scanner(System.in);
        StudyTracker stobj = new StudyTracker();

        System.out.println("-----------------------------------------------------------");
        System.out.println("------------Welcom to Marvellous Study Tracker-------------");
        System.out.println("-----------------------------------------------------------");

        int iChoice = 0;

        do
        {
           System.out.println("please select appropriate option");
           System.out.println("1 : Insert new study log");
           System.out.println("2 : view all study log");
           System.out.println("3 : Export study log to csv file");
           System.out.println("4 : Summary of study log by date");
           System.out.println("5 : Summary of study log by subject");
           System.out.println("6 : Exit the application");

           iChoice = sobj.nextInt();

           switch(iChoice)
           {
               // Insert new study loh
               case 1 :
                     stobj.InsertLog();
                     break;
               // view all study log
               case 2 :
                     stobj.DisplayLog();
                     break;
               // Export study log to csv file
                case 3 :
                    stobj.ExportCSV();
                    break;
               // Summary of study log by date
                case 4 :
                    stobj.SummaryByDate();
                    break;
               // Summary of study log by subject
                case 5 :
                    stobj.SummaryBySubject();
                    break;

               //Exit the application
                case 6 :
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("-------Thnak you for using marvellous Study Tracker---------");
                    System.out.println("-----------------------------------------------------------");
                    break;


                default :
                       System.out.println("Please Enter valid option");
                       break;

                    


               
           }


        }while(iChoice != 6);// End of the do while

   
       
        
    }// End of main
}// End of starter class