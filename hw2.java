import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter today's date");
        int a = sc.nextInt();
        System.out.println("Enter days to be elapsed");
        int b = sc.nextInt();
        int c = (a + b) % 7;
        String d = " ";
        switch (a) {
            case 0:
                d = "Sunday";
                break;
            case 1:
                d = "Monday";
                break;
            case 2:
                d = "Tuesday";
                break;
            case 3:
                d = "Wednesday";
                break;
            case 4:
                d = "Thursday";
                break;
            case 5:
                d = "Friday";
                break;
            case 6:
                d = "Saturday";
                break;
        }
        if (c == 0)
            System.out.printf("Today is %s and the future day is Sunday", d);
        else if (c == 1)
            System.out.printf("Today is %s and the future day is Monday", d);
        else if (c == 2)
            System.out.printf("Today is %s and the future day is Tuesday", d);
        else if (c == 3)
            System.out.printf("Today is %s and the future day is Wednesday", d);
        else if (c == 4)
            System.out.printf("Today is %s and the future day is Thursday", d);
        else if (c == 5)
            System.out.printf("Today is %s and the future day is Friday", d);
        else if (c == 6)
            System.out.printf("Today is %s and the future day is Saturday", d);

    }
}
