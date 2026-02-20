/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pgm5;


public class pgm5 {
    public static void main(String[] args) {
        String s1=new String("GoodDay");
        String s2=new String("Namaste");
        String s3=new String("namaste");
        
        System.out.println("character at index 4:"+s1.charAt(4));
        char[] c=new char[10];
        s1.getChars(3,6,c,1);
        System.out.println("extracted characters:"+new String(c));
        
        char[] c1=s1.toCharArray();
        System.out.println("character representation");
        for(char i:c1){
            System.out.println(i);
            
        }
        System.out.println("s1 and s2 is equal?:"+s1.equals(s2));
        System.out.println("s2 and s3 is equal(not case sensitive):"+s2.equalsIgnoreCase(s3));
        System.out.println("s1 starts with 'Go':"+s1.startsWith("Go"));
        System.out.println("s2 ends with 'ab':"+s2.endsWith("ab"));
        System.out.println("Index of m in s2:"+s2.indexOf("m"));
        System.out.println("last index of d in s1:"+s1.lastIndexOf("d"));
        System.out.println("index of a after index 2 in s2:"+s2.indexOf('a',2));
        System.out.println("concatenation(s1 and s2):"+s1.concat(s2));
        System.out.println("substring of s1:"+s1.substring(4));
        System.out.println("after trim:"+s1.trim());
        
        
        
   
    }
    
}
