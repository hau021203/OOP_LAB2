package com.mycompany.question1;
import java.util.*;
public class Question1 {

    public static void main(String[] args) {
        Complex n1 = new Complex(3,4);
        n1.OutputComplex();
        Complex n2 = new Complex(5,6);
        n2.OutputComplex();
        Complex n3 = n1.Add(n2);
        n3.OutputComplex();
        Complex n4 = n1.Sub(n2);
        n4.OutputComplex();
        Complex n5 = n1.Mul(n2);
        n5.OutputComplex();
        Complex n6 = n1.Div(n2);
        n6.OutputComplex();
    }
}
