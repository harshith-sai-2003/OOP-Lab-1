//Find the largest and smallest element in 1D array.
//Completed!
package l4.q2;
import java.util.Scanner;
public class L4Q2 {
    public static void main(String[] args) {
        int a[]=new int[10];
        int n,i,min,max;
        System.out.print("Enter the number of values in array: ");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        System.out.println("Enter the elements in the array: ");
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        min=a[0];
        max=a[n];
        for(i=0;i<n;i++){
            if(min>a[i])
                min=a[i];
            if(max<a[i])
                max=a[i];
        }
        System.out.println("The maximum of the given array is " + max);
        System.out.println("The minimum of the given array is " + min);
    }
    
}
