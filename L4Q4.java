//Write a program to merge two arrays in third array. Also sort the third array in ascending order.
//Completed!
package l4.q4;
import java.util.Scanner;
public class L4Q4 {
    public static void main(String[] args) {
        int a[]=new int[10],b[]=new int[10],c[]=new int[20];
        int p,q,i,j,min=0,temp;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of elements in first array: ");
        p=in.nextInt();
        System.out.print("Enter the number of elements in second array: ");
        q=in.nextInt();
        System.out.println("Enter the elements in first array: ");
        for(i=0;i<p;i++)
            a[i]=in.nextInt();
        System.out.println("Enter the elements in second array: ");
        for(j=0;j<q;j++)
            b[j]=in.nextInt();
        
        for(i=0;i<p;i++)
            c[i]=a[i];
        for(j=0;j<q;j++)
            c[j+p]=b[j];
        
        System.out.println("Merged array is:");
        for(i=0;i<p+q;i++)
            System.out.printf("%d\t",c[i]);
        System.out.println("");
        
        for(i=0;i<p+q;i++){
        for(j=0;j<p+q;j++){
        if(c[i]<c[j]){
            temp=c[j];
            c[j]=c[i];
            c[i]=temp;
        }
        }
        }
        System.out.println("Sorted array is:");
        for(i=0;i<p+q;i++)
            System.out.printf("%d\t",c[i]);
        System.out.println("");
    }

}
