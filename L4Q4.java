/*Find the trace and norm of a given square matrix.
[Hint: Trace= sum of principal diagonal elements;
Norm= Sqrt(sum of squares of the individual elements of an array)]*/

import java.util.*;
public class L4Q4 {
    public static void main(String[] args){
        int a[][]=new int[10][10];
        int i,j,n,trace=0,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the order of matrix: ");
        n=in.nextInt();
        System.out.println("Enter the elements into the matrix: ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++)
                a[i][j]=in.nextInt();
        }
        System.out.println("The matrix is: ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++)
                System.out.printf("%d\t",a[i][j]);
            System.out.println("");
        }
        System.out.print("The trace of the  matrix is: ");
        for(i=0;i<n;i++)
            trace+=a[i][i];
        System.out.println(trace);
        for(i=0;i<n;i++){
            for(j=0;j<n;j++)
                sum+=Math.pow(a[i][j],2);
        }
        System.out.println("The norm of the matrix is: "+Math.pow(sum,0.5));
    }
}
