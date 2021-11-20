//Print all the prime numbers in a given 1D array.
//Completed!
package l4.q1;
import java.util.Scanner;
public class L4Q1 {
    public static void main(String[] args) {
        int a[]=new int[10];
        int i,n,j,count;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of values to be entered in the array: ");
        n=in.nextInt();
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.println("The prime number in the given array are:");
        for(i=0;i<n;i++){
            count=0;
            for(j=1;j<=a[i];j++){
                if(a[i]%j==0)
                    count++;
            }
            if(count==2)
                System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    
}
