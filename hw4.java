import java.util.Scanner;
public class hw4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a=sc.nextInt();
        System.out.println("Is 10 divisible by 5 and 6?"+((a%5==0)&&(a%6==0)));
        System.out.println("Is 10 divisible by 5 or 6?"+((a%5==0)||(a%6==0)));
        System.out.println("Is 10 divisible by 5 and 6, but not both?"+((a%5==0)^(a%6==0)));
    }
}
