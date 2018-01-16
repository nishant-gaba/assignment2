import java.util.Scanner;
public class class2_primenumber_nishantgaba{
public static void main(String[] args)
  {
  int n,i=2;
  System.out.print("enter no."); 
  n=new Scanner(System.in).nextInt();
  boolean check=false;
  while(i<=n-1)
  {
	if(n%i==0)
	{
         check=true;
           break;
	}
	else
	{
		i=i+1;
           check=false;
	}
      
    }
   if(check){
     System.out.print("no. is not prime");
  }
     else{
     System.out.print("no. is prime");
  }  
}
}