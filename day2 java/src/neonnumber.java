/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
public class neonnumber {
boolean check(int n){
    int sq=n*n;
    int sum=0;
    int temp=n;
    while(temp!=0){
        int d= sq%10;
        sum=sum+d;
        sq=sq/10;
}
if(sum==n){
    return true;
}
else{
    return false;
}
    
}
    public static void main(String[] args) {
       neonnumber obj=new neonnumber();
    int n =9 ;
      if(obj.check(n)){
          System.out.println(n+ "is a neon number");
      }else{
              System.out.println(n + "is not a neon number");
      }
      }
    }


