/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class automorphicnumber {

   
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number");
     int n=sc.nextInt();
     int square=n*n;
     int temp=n;
     while(temp>0){
     if(temp%10!= square%10){
         System.out.println("not automorphic");
         return;
     }
    temp/=10;
    square/=10;
    }
    System.out.println("automorphic");
}
}
