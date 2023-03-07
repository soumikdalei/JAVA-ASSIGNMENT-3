import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter unit");
        int unit=sc.nextInt();
        System.out.println("Enter true to pay through online and enter false to pay offline");
        char b=sc.next().charAt(0);
        double bill=0;double discount=0;
        if(unit<=50)
            bill=3*unit;
        else if(unit>50&&unit<=200)
            bill=3*50+(unit-50)*4.80;
        else if(unit>200&&unit<=400)
            bill=50*3+150*4.80+(unit-200)*5.80;
        else
            bill=50*3+150*4.80+200*5.80+(unit-400)*6.20;
        System.out.println("Amount:"+bill);
        if(b=='y'||b=='Y')
             discount=(3d/100d)*bill;
        else
            discount=0;
        System.out.println("Discount="+discount);
        bill=bill-discount;
        System.out.println("Amount payable:"+bill);


    }

}
