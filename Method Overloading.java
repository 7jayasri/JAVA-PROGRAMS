import java.util.*;
public class Mol {
    void multiply(int a, int b) {
        System.out.println("Multiplication is " + (a * b));
    }
    void multiply(int a, int b, int c) {
        System.out.println("Multiplication is " + (a * b * c));
    }

    public static void main(String[] args) {
        Mol obj = new Mol();
        
        obj.multiply(4, 5);       
        obj.multiply(4, 5, 6);   
    }
}
//Output:
Multiplication is 20
Multiplication is 120

