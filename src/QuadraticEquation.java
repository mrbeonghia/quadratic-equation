import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Quadratic Equation ax2+bx+c=0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a= ");
        double a = scanner.nextDouble();
        System.out.print("Enter b= ");
        double b = scanner.nextDouble();
        System.out.print("Enter c= ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if(delta<0){
            System.out.println("The equation has no roots");
        }
        if(delta==0){
            double x = quadraticEquation.getRoot1();
            System.out.println("The equation has one root: "+x);
        }
        else {
            double x1 = quadraticEquation.getRoot1();
            double x2 = quadraticEquation.getRoot2();
            System.out.println("The equation has two roots: "+x1+" and "+x2);
        }
    }
    private double a,b,c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return b*b - 4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(b*b - 4*a*c))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.sqrt(b*b - 4*a*c))/(2*a);
    }
}
