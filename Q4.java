import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your choice");
        int a= sc.nextInt();
        System.out.println("Enter computer's choice");
        int c=(int)(1+(9*Math.random()));
                System.out.println(c);
        if(a==c)
            System.out.println("You got it right");
        else if(c==(a+1)||c==(a-1))
            System.out.println("Almost got it");
        else
            System.out.println("You are wrong");

    }
}
