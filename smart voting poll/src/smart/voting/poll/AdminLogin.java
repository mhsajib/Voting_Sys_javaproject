//Admin LogIn
package smart.voting.poll;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLogin extends JFrame {
    
    private Container con1;
    private JLabel imagelabel1,adminName,adminID;
    private JButton btn1,btn2;
   // private ImageIcon img;
    private Font f,f2,f3;
    private JTextField field1;
    private JPasswordField pField;
    public AdminLogin(){
       initComponents();
    }
    
    void initComponents(){
        con1 = this.getContentPane();
        con1.setLayout(null);
        con1.setBackground(Color.DARK_GRAY);
        //img = new ImageIcon(getClass().getResource("Admint.png"));
        
        f = new Font("Arial",Font.BOLD,22);
        f2 = new Font("Arial",Font.BOLD,30);
        f3 = new Font("Arial",Font.BOLD,70);
         
        imagelabel1 =new JLabel("Admin Login");
        imagelabel1.setBounds(450,20,500,250);
        imagelabel1.setForeground(Color.cyan);
        imagelabel1.setFont(f3);
        
        adminName = new JLabel("Admin_Name :");
        adminName.setBounds(150,250,170,25);
        adminName.setFont(f);
        adminName.setForeground(Color.WHITE);
        
        field1 = new JTextField();
        field1.setBounds(300,250,170,25);
        field1.setFont(f);
        
        adminID = new JLabel("Admin_password :");
        adminID.setBounds(40,295,210,25);
        adminID.setFont(f);
        adminID.setForeground(Color.white);
        
        pField = new JPasswordField();
        pField.setBounds(300,295,170,25);
        pField.setFont(f);
        
        
        btn1 = new JButton("Signin");
        btn1.setFont(f2);
        btn1.setBounds(250,360,250,50);
        
        
        
        
        con1.add(imagelabel1);
        con1.add(adminName);
        con1.add(field1);
        con1.add(adminID);
        con1.add(pField);
        con1.add(btn1);
    }
    
    public static void main(String[] args) {
        //create frame For admin 
        AdminLogin frame1 = new AdminLogin();
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setBounds(150,0,1000,700);
       
    }
}
