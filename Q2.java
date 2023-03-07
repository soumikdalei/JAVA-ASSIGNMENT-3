import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter water intake inh ml");
        int a=sc.nextInt();
        if(a>=5000)
            System.out.println("Yes, Alice is following doctor's advice");
        else
            System.out.println("No, Alice is not following doctor's advice");
    }
}
