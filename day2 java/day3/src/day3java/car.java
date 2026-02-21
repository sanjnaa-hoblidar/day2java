/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3java;

class vehicle{
    void speed(){
    System.out.println("vehicles should have slow speed");
}
    void speed(int maxspeed){
        System.out.println("maximum speed of vehicle is"+maxspeed);
    }
}
public class car extends  vehicle {
    void speed(String mode){
        System.out.println("car is running"+mode+"mode");
    }
    public static void main(String[] args){
        car ob=new car();
        ob.speed();
        ob.speed(100);
    }
}
