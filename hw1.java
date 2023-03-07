import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice (0) for scissor ,(1) for rock ,(2) for paper ");
        int a=sc.nextInt();
        System.out.println("Computer's choice ");
        int b=(int)(1+(3*Math.random())-1);
        System.out.println(b);
        if(a==b)
            System.out.println("Draw");
        else if(a==1&&b==0)
            System.out.println("Computer looses") ;
        else if(a==0&&b==1)
            System.out.println("Computer wins");
        else if(a==1&&b==2)
            System.out.println("Computer wins");
        else if(a==2&&b==1)
            System.out.println("Computer looses");
        else if(a==0&&b==2)
            System.out.println("Computer looses");
         else if(a==2&&b==0)
            System.out.println("Computer wins");

    }
}
