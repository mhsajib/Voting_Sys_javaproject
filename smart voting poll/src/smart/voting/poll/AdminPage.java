
package smart.voting.poll;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class AdminPage extends JFrame {
    private Container c;
    private JMenuBar mbar;
    private JMenu add,update,display;
    private JMenuItem addVoter,addCandidate,upVoter,upCandidate,dispVoter,dispCandidate;
    private Font f,f1;
    public AdminPage()
    {
        initComponents();
    }
    public void initComponents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);
        //creating Font.........................
        f = new Font("Arial",Font.BOLD,30);
        f1= new Font("Arial",Font.BOLD,23);
        
        //menu bar........................
        mbar = new JMenuBar();
        mbar.setSize(100,100);
        mbar.setBackground(Color.PINK);
        
        
        this.setJMenuBar(mbar);
        
        add = new JMenu("Add");
        
        
        update = new JMenu("Update");
        display = new JMenu("Display");
        
        mbar.add(add);
        mbar.add(update);
        mbar.add(display);
        
        
        //font change..........................
        add.setFont(f);
        update.setFont(f);
        display.setFont(f);
        
        c.add(mbar);
        
        //JMenuItem
        addVoter=new JMenuItem("Add Voter");
        addVoter.setFont(f1);
        addCandidate=new JMenuItem("Add Candidate");
        addCandidate.setFont(f1);
        upVoter=new JMenuItem("Update Voter");
        upVoter.setFont(f1);
        upCandidate= new JMenuItem("Update Candidate");
        upCandidate.setFont(f1);
        dispVoter=new JMenuItem("Display Voter");
        dispVoter.setFont(f1);
        dispCandidate=new JMenuItem("Display Candidate");
        dispCandidate.setFont(f1);
        
        add.add(addVoter);
        add.add(addCandidate);
        update.add(upVoter);
        update.add(upCandidate);
        
        display.add(dispVoter);
        display.add(dispCandidate);
        
        
        
    }
    public static void main(String[] args) {
        AdminPage frame = new AdminPage();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(150,0,1000,700);
    }
}
