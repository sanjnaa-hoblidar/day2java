/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day3java;

/**
 *
 * @author user
 */
public class Calculator {
static void calci(int a,int b){
    System.out.println(a+b);
}
    static void calci(double a,double b){
        System.out.println(a*b);
    }
    static int calci(int a,int b,int c){
        return (a+b)/c;
    }
    public static void main(String[] args) {
        calci(5,8);
        calci(5.9,10.2);
        calci(2,5,6);
    }
    
}
