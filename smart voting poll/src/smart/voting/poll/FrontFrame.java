//working on Front Frame..... 
package smart.voting.poll;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrontFrame extends JFrame{
    private Container c;
    private Font f;
    private JButton b1,b2;
    private ImageIcon img;
    private JLabel imgLabel;
    
    public FrontFrame()
    {
        initComponents();
    }
    public void initComponents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);
        
        f = new Font("Arial",Font.BOLD,70); //front...
        img = new ImageIcon(getClass().getResource("vote.png"));
        imgLabel= new JLabel(img);
        imgLabel.setBounds(355,100,img.getIconWidth(),img.getIconHeight());
        //imgLabel.setBackground(Color.red);
        //imgLabel.setOpaque(true);
        c.add(imgLabel);
        
        //Button creating
        JButton b1=new JButton("Admin");
        b1.setFont(f);
        b1.setBounds(355,600,250,100);
        c.add(b1);
        JButton b2=new JButton("User");
        b2.setFont(f);
        b2.setBounds(690,600,250,100);
        c.add(b2);
        
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                AdminLogin frames=new AdminLogin();
                frames.setVisible(true);
                frames.setBounds(300,0,700,520);
            }
        });
        
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                UserLogin frame=new UserLogin();
                frame.setVisible(true);
                frame.setBounds(300,0,700,520);
            }
        });
        
        
    }
    public static void main(String[] args) {
        FrontFrame frontf = new FrontFrame();
        frontf.setVisible(true);
        frontf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frontf.setBounds(300,0,1300,1020);
        frontf.setTitle("Voting Poll");
        frontf.setResizable(false);
    }
}
