import java.util.*;
class gradecalculator
{
    public static void main(){
     int n,i,j=1;
     int s[ ]=new int[10];int tot=0;
     double avgper;
     String grade=" ";
     System.out.println("   Student grade calculator   ");
     System.out.println("Enter the number of subjects:");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     System.out.println("Enter your marks obatined ot of 100 in:");
     
     for(i=0;i<n;i++)
     {    
         System.out.println("Subject"+j+":");
         s[i]=sc.nextInt();
         j++;         
     }
     for(i=0;i<n;i++)
     {
         tot+=s[i];
         }
     avgper=((tot)/(n*100))*100;
     if(avgper>=99.0 && avgper<=100.0)
     grade="A+";
     else
     if(avgper>=96.0 && avgper<99.0)
     grade="A";
     else
     if(avgper>=90.0 && avgper<94.0)
     grade="A-";
     else
     if(avgper>=87.0 && avgper<90.0)
     grade="B+";
     else
     if(avgper>=85.0 && avgper<87.0)
     grade="B";
     else
     if(avgper>=80.0 && avgper<85.0)
     grade="B-";
     else
     if(avgper>=77.0 && avgper<80.0)
     grade="C+";
     else
     if(avgper>=75.0 && avgper<77.0)
     grade="C";
     else
     if(avgper>=70.0 && avgper<75.0)
     grade="C-";
     else
     if(avgper>=67.0 && avgper<70.0)
     grade="D+";
     else
     if(avgper>=65.0 && avgper<67.0)
     grade="D";
     else
     if(avgper>=60.0 && avgper<65.0)
     grade="D-";
     else
     if(avgper<60.0)
     grade="F";
     System.out.println("----RESULTS----");
     System.out.println("Total Marks Obtained:  "+tot+"/"+(n*100));
     System.out.println("Average Percentage:    "+avgper+"%");
     System.out.println("Grade:                  "+grade);
     
     
     
    }
}