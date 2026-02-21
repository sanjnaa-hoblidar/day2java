/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day3java;

class parent1{
    parent1(){
        System.out.println("parent");
    }
}
public class child1 extends parent1 {

    child1(){
        super();
        System.out.println("child");
    }
    public static void main(String[] args) {
        child1 ob=new child1();
    }
    
}
