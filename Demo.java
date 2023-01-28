package solution;
import java.util.Scanner;

public class Demo
{

    public static void main(String[] args)
    {
        Gender g = null;
        Scanner sc = new Scanner(System.in);
        boolean con = true;
        
        while(con) {
        try {
       
        System.out.println("What is your Gender? Type 1 for girl." +
                    " Type 2 for boy. Type 3 for Non-Binary.");
        int answer = sc.nextInt();
        
        
       if(answer == 1){
           g = new Girl();
       }
       else if(answer == 2) {
           g = new Boy();
       }
       else if(answer == 3){
           g = new NonBinary();
       }
      
       g.myGenderStatement();
       con = false;
       sc.close();
        }
        catch(Exception e)
        {
            System.out.println("\n\nPlease enter a valid input!\n\n");
            sc.nextLine();
        }
        
    }
    }
}
