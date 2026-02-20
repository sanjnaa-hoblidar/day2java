/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day2.java;

/**
 *
 * @author user
 */
public class staticcount {
        static int count=0;
        int id;
        staticcount(){
            count++;
            id=count;
            System.out.println("Object ID:"+id);
}
        
    
    public static void main(String[] args) {
       staticcount c1=new staticcount();
       staticcount c2=new staticcount();
       staticcount c3=new staticcount();
       System.out.println("total objects created:"+count);
    }
    
}
