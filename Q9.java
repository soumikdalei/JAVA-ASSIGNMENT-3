import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is the largest ");
            if (b > c)
                System.out.println(b + " is the 2nd largest ");
            else
                System.out.println(c + " is the 2nd largest ");
        }

            if (b > a && b > c) {
                System.out.println(b + " is the largest ");
                if (a > c)
                    System.out.println(a + " is the 2nd largest ");
                else
                    System.out.println(c + " is the 2nd largest ");

            }
                if (c > b && c > a) {
                    System.out.println(c + " is the largest ");
                    if (a > b)
                        System.out.println(a + " is the 2nd largest ");
                    else
                        System.out.println(b + " is the 2nd largest ");
                }


            }
        }


