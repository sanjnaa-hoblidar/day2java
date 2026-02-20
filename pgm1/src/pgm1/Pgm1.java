/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pgm1;

import java.util.*;
public class Pgm1{
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(18);
        al.add(10);
        al.add(15);
        al.add(12);
System.out.println("contents of arraylist is:"+al);
al.remove(1);
System.out.println("contents of arraylist after removed is"+al);
al.add(2,16);
al.add(3,22);
System.out.println("contents of arraylist after adding element at index is:"+al);
Collections.sort(al,Comparator.reverseOrder());
System.out.println("contents of arraylist after sorting in reverse order is"+al);
Object[]arr=al.toArray();
System.out.println("contents of array list after converting into array");
for(int i=0;i<arr.length;i++)
System.out.println(arr[i]);
    }   
}
