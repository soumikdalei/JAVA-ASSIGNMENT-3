import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter quadrents");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        if(x==0&&y==0)
            System.out.println("("+x+","+y+")"+" is at origin ");
        else if(x!=0&&y==0)
            System.out.println("("+x+","+y+")"+" is  x axis ");
        else if(x==0&&y!=0)
            System.out.println("("+x+","+y+")"+" is  y axis ");
        else if(x>0&&y>0)
            System.out.println("("+x+","+y+")"+" is  I quadrant ");
        else if(x<0&&y>0)
            System.out.println("("+x+","+y+")"+" is  II quadrant ");
        else if(x<0&&y<0)
            System.out.println("("+x+","+y+")"+" is  III quadrant ");
        else if(x>0&&y<0)
            System.out.println("("+x+","+y+")"+" is  IV quadrant ");



    }
}
