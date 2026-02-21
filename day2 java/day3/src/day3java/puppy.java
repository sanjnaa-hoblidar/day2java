/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day3java;

/**
 *
 * @author user
 */
public class puppy extends DOG {

    void display(){
    System.out.println("puppy class");
    }
    public static void main(String[] args) {
       puppy obj=new puppy();
       obj.display();
       obj.sound();
       obj.print();
    }
    
}
