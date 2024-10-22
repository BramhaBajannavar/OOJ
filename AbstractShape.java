public abstract class Shape {
    int p,q;
    public abstract void printarea();
    Shape(int p,int q){
        this.p =p;
        this.q=q;
    }
    public static void main(String [] args){
        Shape rectangle = new Rectangle(5,5);
        Shape triangle = new Triangle(5,2);
        Shape circle = new Circle(5);
    

    rectangle.printarea();
    triangle.printarea();
    circle.printarea();
    }
}


public class Rectangle extends Shape{
    Rectangle(int l , int b){
        super(l,b);
    }

    @Override
    public void printarea(){
        System.out.println("Area of rectangle is "+ p*q);
    }
}

public class Triangle extends Shape{
    Triangle(int l , int b){
        super(l,b);
    }

    @Override
    public void printarea(){
        System.out.println("Area of triangle is "+ 0.5*p*q);
    }
}


public class Circle extends Shape{
    Circle(int l){
        super(l,0);
    }

    @Override
    public void printarea(){
        System.out.println("Area of circle is "+ 3.14*p*p);
    }
}
