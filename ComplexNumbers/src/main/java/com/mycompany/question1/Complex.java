package com.mycompany.question1;
import java.util.*;
public class Complex {
    private double a;
    private double b;
    Complex(){}
    Complex(double a, double b){
        this.a = a;
        this.b = b;
    }
    public void InputComplex(){
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter real part :");
        a = sc.nextDouble();
        System.out.println("Enter imaginary part :");
        b = sc.nextDouble();
    }
    public void OutputComplex(){
        
        System.out.println(a+" + "+b+"i");
    }
    public Complex Add(Complex c){
        Complex result = new Complex(this.a + c.a , this.b + c.b);
        return result; 
    }
    public Complex Sub(Complex c){
        Complex result = new Complex(this.a - c.a , this.b - c.b);
        return result;
    }
    public Complex Mul(Complex c){
        Complex result = new Complex((this.a*c.a)-(this.b*c.b),(this.a*c.b)+(this.b*c.a));
        return result;
    }
    public Complex Div(Complex c){
        Complex result = new Complex(((this.a*c.a)+(this.b*c.b))/((c.a*c.a)+(c.b*c.b)),((this.b*c.a)-(this.a*c.b))/((c.a*c.a)+(c.b*c.b)));
        return result;
    }
}
