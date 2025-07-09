import java.util.Scanner;
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        return Math.pow(b,2) - 4 * a * c;
    }

    public double getRoot1(){
        double delta = getDiscriminant();
        if(delta < 0) return 0;
        return (-b + Math.pow(delta, 0.5)) / ( 2 * a);

    }
    public double getRoot2(){
        double delta = getDiscriminant();
        if(delta < 0) return 0;
        return (-b - Math.pow(delta, 0.5)) / (2 *a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = sc.nextDouble();
        System.out.print("Input b: ");
        double b = sc.nextDouble();
        System.out.print("Input c :");
        double c = sc.nextDouble();

        if(a == 0){
            System.out.print(" this is not pt bac 2 ( a is not 0):");

        }else{
            QuadraticEquation equation = new QuadraticEquation(a,b,c);
            double delta = equation.getDiscriminant();

            System.out.println("Delta = " + delta );
            if (delta >= 0) {
                double root1 = equation.getRoot1();
                double root2 = equation.getRoot2();
                if(delta == 0){
                    System.out.println("phuong trinh co mot nghiem kep: x = " + root1);
                }else{
                    System.out.println("Phuong trinh co 2 nghiem: ");
                    System.out.println("x1 = " + root1);
                    System.out.println("x2 = " + root2);
                }
            }else{
                System.out.println("The equation has no roots");
            }
        }
        sc.close();
    }
}

