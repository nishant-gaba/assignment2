class xtree{
public static void main(String[] args){
int i=1;
while(i<=4)
{
int j=1;
while(j<=5-i)       
{
System.out.print(" ");
j=j+1;
}
int k=1;
while(k<=2*i-1){
System.out.print("*");
k=k+1;
}
System.out.println();
i=i+1;
}
}
}