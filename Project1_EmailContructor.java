import java.util.*;

public class Project1_EmailContructor
{
  public static void main(String[] args)

  {
    String[] parameters=new String[4]; //Java starts array indexing at 0.
    Scanner user_input= new Scanner(System.in);

    System.out.println("This program takes a series of user supplied paramters\n and outputs the SMTP Commands Used to Send an e-mail\n");
    System.out.println("Please enter SMTP Server");
    
    parameters[0]=user_input.nextLine();
    
    System.out.println(parameters[0]);
  }
}