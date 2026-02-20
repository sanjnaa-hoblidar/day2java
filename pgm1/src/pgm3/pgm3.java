/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pgm3;

import java.util.*;
class stud
{
    String name,usn;
    stud(String s1,String s2)
    {
        name=s1;
        usn=s2;
    }
    @Override
    public String toString()
    {
        return "Name:"+name+"|USN:"+usn;
    }*/
}
public class pgm3 {
    public static void main(String[] args) {
      LinkedList<stud>arr=new LinkedList<>();
      stud st1=new stud("abc","is020");
      stud st2=new stud("aba","is021");
      stud st3=new stud("ijk","is022");
      stud st4=new stud("san","is089");
      stud st5=new stud("man","is096");
      arr.add(st1);
      arr.add(st2);
      arr.add(st3);
      arr.add(st4);
      arr.add(st5);
      for(stud s:arr)
          System.out.println(s);
    }
    
}
