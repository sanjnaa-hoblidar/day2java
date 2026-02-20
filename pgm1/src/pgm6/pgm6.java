/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pgm6;


public class pgm6 {

    
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Hello");
        stringBuffer.append("World!");
        System.out.println("after append :"+stringBuffer);
        stringBuffer.insert(6,",");
        System.out.println("after insert :"+stringBuffer);
        stringBuffer.delete(5,7);
        System.out.println("after delete :"+stringBuffer);
        stringBuffer.reverse();
        System.out.println("after reverse :"+stringBuffer);
        stringBuffer.replace(0, 5, "Hi");
        System.out.println("after replace :"+stringBuffer);
        System.out.println("capacity:"+stringBuffer.capacity());
        System.out.println("Length:"+stringBuffer.length());
        stringBuffer.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity:"+stringBuffer.capacity());
        stringBuffer.setLength(5);
        System.out.println("length is set to:"+stringBuffer.length());
        System.out.println("after set length:"+stringBuffer);
        stringBuffer.append("!");
        System.out.println("after append:"+stringBuffer);
        char charAtIndex=stringBuffer.charAt(0);
        System.out.println("character at index 0:"+charAtIndex);
        String substring=stringBuffer.substring(3);
        System.out.println("substring from index 3:"+substring);
        String str=stringBuffer.toString();
        System.out.println("string representation:"+str);
    }
    
}
