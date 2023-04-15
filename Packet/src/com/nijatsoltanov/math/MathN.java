/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nijatsoltanov.math;

/**
 *
 * @author CP
 */
public class MathN implements IMathN{

    @Override
    public void addition(int a, int b) {
        System.out.println("Result : " + (a+b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("Result : " + (a-b));
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println("Result : " + (a*b));
    }

    @Override
    public void division(int a, int b) {
        System.out.println("Result : " + (double)(a/b));
    }
    
}
