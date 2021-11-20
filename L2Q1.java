/*
Write a Java program to find the result of the following expressions for various values of a & b:
Completed!
*/
package l2.q1;
import java.util.Scanner;
public class L2Q1 {

    public static void main(String[] args) {
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value a: ");
        a = in.nextInt();
        System.out.print("Enter the value b: ");
        b=in.nextInt();
        System.out.print("(a<<2)+(b>>2)=");
        System.out.println((a<<2)+(b>>2));
        System.out.print("b>0=");
        System.out.println(b>0);
        System.out.print("(a+b*100)/10=");
        System.out.println((a+b*100)/10);
        System.out.print("a&b=");
        System.out.println(a&b);

    }
    
}
