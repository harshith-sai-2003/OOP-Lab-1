/*
Write a Java program to find largest and smallest among 3 numbers using ternary operator.
*/
//Completed!
package l2.q2;
import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        int a,b,c,max,min;
        System.out.println("Enter three values:");
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        min=a>b? c>b? b:c : c>a? a:c;
        max=a>b? a>c? a:c : b>c? b:c;
        System.out.println("Maximum of a,b,c is " + max);
        System.out.println("Minimum of a,b,c is " + min);
    }
    
}
