import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter unit");
        int unit=sc.nextInt();
        double bill=0;
        if(unit<=50)
            bill=unit*50;
        else if(unit>50&&unit<=200)
            bill=3*50+(unit-50)*4.80;
        else if(unit>200&&unit<=400)
            bill=50*3+150*4.80+(unit-200)*5.80;
        else
            bill=50*3+150*4.80+200*5.80+(unit-400)*6.20;
        System.out.println(bill);

    }
}
