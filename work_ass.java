

    

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class work_ass extends WindowAdapter implements ActionListener{
    Frame fr;
    MenuBar menuBar;
    Menu menu1,menu2,menu3;
    MenuItem itemLogin,itemStudent;
    JPanel p1,p2,p3,p4,p5;
    Label label;
     JLabel l1,l2,l3;
     JButton btn;
     JTextField tf1,tf2;

   work_ass(){
    fr=new Frame();
    menuBar=new MenuBar();
    menu1=new Menu("Pages");
    menu2=new Menu("Edit");
    menu3=new Menu("Help");
    itemLogin=new MenuItem("login");
     itemStudent=new MenuItem("student");
     itemStudent.addActionListener(this);
    fr=new JFrame();
    l1= new JLabel("Username");
    l2= new JLabel("Password");
    l3=new JLabel("LOGIN PAGE");
    tf1=new JTextField();
    tf2=new JTextField();
    btn=new JButton("LOGIN");
    JButton btn1=new JButton("SIMPLE JAVA AWT LAYOUT");
    JButton btn2=new JButton();
    JButton btn3=new JButton();
    JButton btn4=new JButton();
    JButton btn5=new JButton();
    fr.setLayout(new BorderLayout(0,0));
    fr.add(btn1,BorderLayout.NORTH);
    fr.add(btn4,BorderLayout.SOUTH);
    fr.add(l3,BorderLayout.CENTER);
    fr.add(l1,BorderLayout.CENTER);
    fr.add(l2,BorderLayout.CENTER);
    fr.add(tf1,BorderLayout.CENTER);
    fr.add(tf2,BorderLayout.CENTER);
    fr.add(btn,BorderLayout.CENTER);
    
    fr.add(btn2,BorderLayout.EAST);
    fr.add(btn3,BorderLayout.WEST);
    fr.add(btn5,BorderLayout.CENTER);
    btn.setBounds(160,180,80,40);
    l3.setBounds(130,40,90,50);
    l1.setBounds(70,80,60,50);
    l2.setBounds(70,110,60,80);
    tf1.setBounds(160,90,100,30);
    tf2.setBounds(160,140,100,30);
    btn1.setBackground(Color.blue);
      btn4.setBackground(Color.blue);
    fr.setSize(400, 300);
    fr.setVisible(true);
    fr.setTitle("AWT MENU Practice");
    
     p1=new JPanel();
       p2=new JPanel();
         p3=new JPanel();
           p4=new JPanel();
             p5=new JPanel();
             fr.setMenuBar(menuBar);
             menuBar.add(menu1);
              menuBar.add(menu2);
               menuBar.add(menu3);
               menu1.add(itemLogin);
               menu1.add(itemStudent);
       p1.add(label);
       p1.setBackground(Color.BLUE);
        p1.setForeground(Color.WHITE);
p2.setSize(50, 100);
       p2.setBackground(Color.blue);
       p3.setBackground(Color.GREEN);
       p4.setBackground(Color.GREEN);
       p5.add(l1);
         p5.add(l2);
           p5.add(tf1);
           p5.add(tf2);
           p5.add(btn1);
           p5.setBackground(Color.GRAY);
      fr.add(p1,BorderLayout.NORTH);
      fr.add(p2,BorderLayout.SOUTH);
      fr.add(p3,BorderLayout.EAST);
      fr.add(p4,BorderLayout.WEST);
      fr.add(p5,BorderLayout.CENTER);
      fr.setSize(500, 300);
      fr.setTitle("AWT MENU Practice");
//      fr.setLayout(new BorderLayout());
      fr.setVisible(true);
      fr.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e){
      System.exit(0);
      }
      });
    }
    public static void main(String[] args) {
        new work_ass();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==itemStudent){
   Label label1=new Label("FirstName");
 Label label2=new Label("LastName");
TextField txtfld1=new TextField();
TextField txtfld2=new TextField();
   label1.setBounds(20, 30, 70, 30);
label2.setBounds(20, 70, 70, 30);
txtfld1.setBounds(100, 30, 60, 30);
txtfld2.setBounds(100, 70, 60, 30);
    }
    }
    
}

