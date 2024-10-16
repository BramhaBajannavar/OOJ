import java.util.Scanner;
public class addsub{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        int add=a+b;
        int sub=a-b;
        System.out.println("The addition of two number is= " + add);
        System.out.println("The subtraction of two number is= " + sub);
    }
}
