/*Create a class Result with 2D array and 1D array as its data members.
And write methods to perform the following tasks:-
a.Store marks of 3 subjects obtained by 3 students in 2D array.
b.To store total marks obtained by each student in 1D array.
c.To find the highest marks in each subject and the roll number of the student who secured it.
d.To find the student who obtained the highest total marks.*/

import java.util.*;
class Result{
    int[][] marks =new int[10][10];
    int[] total =new int[]{0,0,0,0,0,0,0,0,0,0};
    int i,j,max;
    void enterMarks(){
        Scanner in=new Scanner(System.in);
        for(i=0;i<3;i++){
            System.out.println("Enter the marks of student-"+(i+1));
            for(j=0;j<3;j++){
                System.out.println("Enter the marks of subject-"+(j+1));
                marks[i][j]=in.nextInt();
            }
        }
    }
    void storeTotal(){
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                total[i]+=marks[i][j];
            }
        }
        for(i=0;i<3;i++)
            System.out.println("Total marks obtained by student-"+(i+1)+" are "+total[i]);
    }
    void highest(){
        for(i=0;i<3;i++){
            max=Math.max(marks[0][i],marks[1][i]);
            System.out.println("Highest marks in subject-"+(i+1)+" is "+Math.max(max,marks[2][i]));
        }
    }
    void topper(){
        System.out.println("The highest total marks are "+Math.max(Math.max(total[0],total[1]),total[2]));
    }
}
public class L5Q1 {
    public static void main(String[] args){
        Result students=new Result();
        students.enterMarks();
        students.storeTotal();
        students.highest();
        students.topper();
    }
}
