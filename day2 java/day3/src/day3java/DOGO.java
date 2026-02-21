/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day3java;

class Animal{
   static void sound(){
        System.out.println("Animal makes a sound");
    
    }
}
public class DOGO extends Animal{
   //@Override
    static void sound(){
        System.out.println("Dog barks");
    }

    
    public static void main(String[] args) {
       Animal obj=new DOGO();
       obj.sound();
    }
    
}
