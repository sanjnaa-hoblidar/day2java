/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pgm2;

import java.util.*;
class numcmp implements Comparator<Integer>
{
    @Override
    public int compare(Integer n1,Integer n2)
    {
        Integer t1=n1%100/10;
        Integer t2=n2%100/10;
        return t1.compareTo(t2);
    }
}
public class pgm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rand;
        Random r=new Random();
        ArrayList<Integer>al=new ArrayList<>();
        System.out.println("enter the range:");
        System.out.println("from:");
        int from=sc.nextInt();
        System.out.println("to:");
        int to=sc.nextInt();
        System.out.println("enter how many numbers:");
        int n=sc.nextInt();
        for(int i=0;i<n;)
        {
            rand=r.nextInt(from,to);
            if(rand%2==0 && rand%5==0)
            {
                al.add(rand);
                i++;
            }
        }
        System.out.println("List is:"+al);
        Collections.sort(al,new numcmp());
        System.out.println("sorted list is:"+al);
        sc.close();
    }
}
