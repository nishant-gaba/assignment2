import java.util.Scanner; 
class class2_greatestno_nishantgaba{
public static void main(String[] args){
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.print("enter a");
a=sc.nextInt();
System.out.println("enter b");
b=sc.nextInt();
System.out.println("enter c");
c=sc.nextInt();
if(a>b && a>c)
System.out.println("a is greatest");
else if(b>c && b>a)
System.out.println("b is grestest");
else if(c>a && c>b)
System.out.println("c is greatest");
else
System.out.println("all are equal");
}
}