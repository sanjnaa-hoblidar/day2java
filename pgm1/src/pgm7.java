import java.awt.event.*;
import javax.swing.*;
public class pgm7 {
    pgm7(){
    JFrame jfrm=new JFrame("jbutton Event Example");
    jfrm.setSize(420,490);
    JButton a=new JButton("Alpha");
    JButton b=new JButton("Beta");
    JLabel l=new JLabel("press a button");
    jfrm.add(a); 
    jfrm.add(b);
    jfrm.add(l);
    a.setBounds(50,150,90,30);
    b.setBounds(150,150,100,30);
    l.setBounds(50,500,100,30);
    a.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            l.setText("alpha was pressed");}});
    b.addActionListener(new ActionListener(){
    
        public void actionPerformed(ActionEvent ae){
            l.setText("beta was pressed");
        }
    });
    jfrm.setLocationRelativeTo(null);
    jfrm.setVisible(true);
    }
public static void main(String[] args){
        new pgm7();
    }        
    }
