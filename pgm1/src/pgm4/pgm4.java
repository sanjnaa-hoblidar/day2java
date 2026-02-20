/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pgm4;


public class pgm4 {
    public static void main(String[] args) {
       String str1="happy birthday";
       System.out.println("string created using string literal:"+str1);
       char[] charArray={'s','a','n','n','y'};
       String str2=new String(charArray);
       System.out.println("string created using character array:"+str2);
       String str3=new String(charArray,1,3);
       System.out.println("string created using portion of a character array:"+str3);
       byte[] byteArray={82,105,118,108,101};
       String str4=new String(byteArray);
       System.out.println("string created using byte array :"+str4);
       String str5=new String(byteArray,1,3);
       System.out.println("string created using byte array and specified character set:"+str5);
       StringBuffer h=new StringBuffer("asia");
       String i=new String(h);
       System.out.println("string buffer to String="+i);
       StringBuilder j=new StringBuilder("home");
       String k=new String(j);
       System.out.println("StringBuilder to String="+k);
       int al[]={67,65,68,69,72};
String m=new String(al,2,3);
System.out.println("code point to string="+m);

    }
    
}
