/*
Find the trace and norm of a given square matrix.
[Hint: Trace= sum of principal diagonal elements;
Norm= Sqrt(sum of squares of the individual elements of an array)]
Completed!
*/
package l2.q1;
import java.util.Scanner;

public class L4Q5 {
    public static void main(String[] args){
        int m[][]=new int[10][10],n,i,j,tr=0,sq=0;
        double no;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the order of matrix: ");
        n=in.nextInt();
        System.out.println("Enter the matrix elements: ");
        for(i=0;i<n;i++) {
            for (j = 0; j < n; j++) {
                m[i][j] = in.nextInt();
            }
        }
        System.out.println("Entered matrix is:");
        for(i=0;i<n;i++) {
            for (j = 0; j < n; j++)
                System.out.printf("%d\t", m[i][j]);
            System.out.println();
        }
        for(i=0;i<n;i++){
            tr+=m[i][i];
        }
        System.out.printf("The trace of matrix is: %d\n",tr);
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                sq+=Math.pow(m[i][j],2);
            }
        }
        no=Math.pow(sq,0.5);
        System.out.printf("The norm of matrix is: %f\n",no);
    }
}