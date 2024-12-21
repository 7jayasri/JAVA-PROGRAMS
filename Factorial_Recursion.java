import java.util.*;
class Factorial
{
public static int fact(int n)
{
if(n==0||n==-1)
{
return 1;
}
else
{
return n*fact(n-1);
}
}
public static void main(String[] args)
{
System.out.println("Enter n value: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(fact(n));
}
}
Output:
Enter n value: 
5
120
