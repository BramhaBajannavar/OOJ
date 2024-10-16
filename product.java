import java.util.Scanner;
public class product{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        int prod=a*b;
        System.out.println("The product of two number is= " + prod);
        
    }
}
