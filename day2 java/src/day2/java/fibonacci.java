
package day2.java;


public class fibonacci {
 void fibonacci(int n){
     int a=0;
     int b=1;
     for(int i=1;i<=n;i++){
       System.out.println(a +" ");
       int c =a+b;
       a=b;
       b=c;
     }
 }
    public static void main(String[] args) {
       fibonacci ob= new fibonacci();
       ob.fibonacci(7);
    }
    
}
