import java.util.*;
public class StudentGradeCalculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF SUBJECTS");
        int n=sc.nextInt();
        double sum=0;

        for(int i=1;i<=n;i++){
            System.out.println("ENTER MARKS IN SUB"+i+" out of 100");
            double marks=sc.nextDouble();
            if(marks>100 || marks<0){
                System.out.println(" INVALID INPUT ");
                i--;
                continue;
            }
            else{
                sum+=marks;
            }
            

        }
        
        double average=(sum/n);
        char grade;


        if(average>=90){
            grade='A';
        }
        else if(average>=80){
            grade='B';
        }
        else if(average>=70){
            grade='C';
        }
        else if(average>=60){
            grade='D';
        }
        else{
            grade='E';
        }

        System.out.println("TOTAL MARKS : "+sum);
        System.out.println("AVERAGE PERCENTAGE : "+average);
        System.out.println("GRADE : "+grade);
    

    }
    
}
