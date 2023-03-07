import java.util.Scanner;
public class hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your gender : ");
        char ch = sc.next().charAt(0);
        System.out.println("First Name : ");
        String f = sc.nextLine();
        sc.nextLine();
        System.out.println("Last Name :");
        String l = sc.nextLine();
        System.out.println("Age :");
        int age = sc.nextInt();
        if (ch == 'f' || ch == 'F') {
            if (age >= 20) {
                System.out.println("Are you married " + f);
                char s = sc.next().charAt(0);
                if (s == 'y' || s == 'Y')
                    System.out.println("Then i shall call you Mrs " + f + l);
                else
                    System.out.println("Then i shall call you Ms " + f + l);
            } else {
                System.out.println(f + l);

            }
        } else {
            if (age >= 20) {
                System.out.println("Then i shall call you Mr " + f + l);
            } else {
                System.out.println(f + l);
            }
        }
    }
}
