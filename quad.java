import java.util.Scanner;
public class quad{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the coefficients:");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=b*b-4*a*c;
        if(d==0){
            System.out.println("Roots are equal");
            System.out.println("Roots are:");
            System.out.println(-b/2*a);
}
        else if(d>0){
            System.out.println("Roots are unique");
            System.out.println((-b+Math.sqrt(d))/(2*a));
            System.out.println((-b-Math.sqrt(d))/(2*a));

}   
        else{
            System.out.println("No real roots");
}
    }
}
