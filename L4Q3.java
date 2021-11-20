//Search for an element in a given matrix and count the number of its occurrences.
//Complete!
package l4q3;
import java.util.Scanner;
public class L4Q3 {
    public static void main(String[] args) {
        int a[][]=new int[10][10];
        int m,n,i,j,ele,count=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        m=in.nextInt();
        System.out.print("Enter the number of columns: ");
        n=in.nextInt();
        System.out.println("Enter the elements in the matrix: ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Entered matrix is: ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.printf("%d\t",a[i][j]);
            }
            System.out.println("");
        }
        System.out.print("Enter the element to be found: ");
        ele=in.nextInt();
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(ele==a[i][j]){
                count++;
                }
            }
        }
        if(count==0)
            System.out.println(ele + " does not exit in the given matrix.");
        else
            System.out.println(ele + " occurs " + count + " times in the given matrix.");
    }
    
}
