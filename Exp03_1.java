class Complex {
    int real, imag;

    Complex(int x, int y) {
        real = x;
        imag = y; 
    }

    Complex() {
        
    }

    void calculate(Complex a, Complex b) {
        real = a.real + b.real;
        imag = a.imag + b.imag;

        System.out.println(real + "+i" + imag);
    }
}

public class Exp03_1 {
    public static void main(String[] args) {
        Complex c1 = new Complex(10,20);
        Complex c2 = new Complex(50,60);
        
        Complex c = new Complex();
        c.calculate(c1,c2);
    }

}
