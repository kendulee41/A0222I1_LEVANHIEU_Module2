package _4_class_object.excercise.e1;

public class QuadraticEquation {
    int a,b,c;
    public QuadraticEquation(){
    };

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b,2) - 4*this.a*this.c;
    }
}
