/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day3java;
class Bank{
    void interest(){
        System.out.println("Bank provides interest on deposits");
    }
   static void interest(double rate){
        System.out.println("interest rate is"+ rate);
    }
}
        

public class SBI extends Bank{
 void interest(double rate,int years){
    System.out.println("interest rate is"+(rate*years)/100);
}
    
    public static void main(String[] args) {
        SBI obj=new SBI();
        obj.interest();
        obj.interest(2.7);
        obj.interest(2.7,4);
    }
    
}
