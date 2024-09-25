import java.util.*;

class Palindrome {

    public static int rev(int n, int temp) {
        if (n == 0) {
            return temp;
        } else {
            temp = (temp * 10) + (n % 10);  
            return rev(n / 10, temp);
        }
    }

    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n value:");
        int n = sc.nextInt(); 

        int temp = rev(n, 0);  

        if (temp == n) 
{
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
      }
}
}
//Output

Enter n value:
121
121 is a palindrome.
