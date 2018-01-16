package acadview;
import java.util.Scanner;

public class leap_year {
public static void main(String[] args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter year");
   int year=sc.nextInt();
    if(year%4==0)
    {
    	System.out.println("it is a leap year");
    }
    else{
    System.out.println("it is not a leap year");
 }
  }
}
