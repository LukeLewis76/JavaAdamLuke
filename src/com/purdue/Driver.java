import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Driver
{
    JPanel panel;

    public static void main(String[] args)
    {
        ClientFactory myCf = ClientFactory.getInstance();
//        Client c1 = myCf.addClientToMap("123456","Adam", "Sullivan",
//                345121234,"dec-2-14",true,"cook");
//        Client c2 = myCf.addClientToMap("654321","Ada", "van",
//                321009876,"dec-2-04",false,"clean");

        myCf.addClientToMap("123456","Adam", "Sullivan",
                345121234,"dec-2-14",true,"cook");
        myCf.addClientToMap("654321","Ada", "van",
                321009876,"dec-2-04",false,"clean");

        System.out.println(myCf.getClientInMap());
        /*
        System.out.println(c1);
        System.out.println(c2);
        myCf.checkIn(c1.getClientId());
        myCf.checkIn(c2.getClientId());
        System.out.println("The # of clients: " + myCf.getCount());
        myCf.checkOut(c1.getClientId());
        myCf.checkOut(c2.getClientId());
        System.out.println("The # of clients: " + myCf.getCount());
        */

        //Setup Frame
        final JFrame frame = new JFrame("Adam and Luke - Final Project Demo");
        frame.setJMenuBar(createMenuBar());
        frame.setContentPane(createPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(500, 200);
        frame.pack();
        frame.setMaximizedBounds(new Rectangle(0,0 , 500, 500));
        frame.setVisible(true);
    }

    public static JPanel createPanel()
    {
        JPanel panel = new JPanel();

        //Create Label
        JLabel L1 = new JLabel("Client Id:");
        JLabel L2 = new JLabel("First Name:");
        JLabel L3 = new JLabel("Last Name:");
        JLabel L4 = new JLabel("SSN:");
        JLabel L5 = new JLabel("DOB:");
        JLabel L6 = new JLabel("Skill Set:");

        //Create Text Field
        JTextField tf1 = new JTextField(30);
        JTextField tf2 = new JTextField(30);
        JTextField tf3 = new JTextField(30);
        JTextField tf4 = new JTextField(30);
        JTextField tf5 = new JTextField(30);
        JTextField tf6 = new JTextField(30);

        //Create Button
        JButton jb1 = new JButton("Save");
        JButton jb2 = new JButton("Clear");

        //Set Grid Bag as Layout
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        //Add Label, textfield, and button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridy = 1;
        panel.add(L1,c);
        c.gridy++;
        panel.add(tf1,c);
        c.gridy++;
        panel.add(L2,c);
        c.gridy++;
        panel.add(tf2,c);
        c.gridy++;
        panel.add(L3,c);
        c.gridy++;
        panel.add(tf3,c);
        c.gridy++;
        panel.add(L4,c);
        c.gridy++;
        panel.add(tf4,c);
        c.gridy++;
        panel.add(L5,c);
        c.gridy++;
        panel.add(tf5,c);
        c.gridy++;
        panel.add(L6,c);
        c.gridy++;
        panel.add(tf6,c);
        c.gridy++;
        panel.add(jb1,c);
        c.gridy++;
        panel.add(jb2,c);

        return panel;
    }

    public static JMenuBar createMenuBar()
    {
        JMenuBar menuBar;
        JMenu menu1, menu2, submenu1, submenu2;
        JMenuItem menuItem1, menuItem2;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Create Main Menu.
        menu1 = new JMenu("Menu");
        menu1.setMnemonic(KeyEvent.VK_F);
        menu1.getAccessibleContext().setAccessibleDescription("Dealing with Files");
        menu1.setBackground(Color.blue);
        menuBar.add(menu1);

        menu2 = new JMenu("Help");
        menu2.setMnemonic(KeyEvent.VK_F);
        menu2.getAccessibleContext().setAccessibleDescription("Help");
        menu2.setBackground(Color.blue);
        menuBar.add(menu2);

        // Client submenu
        submenu1 = new JMenu("Client");
        submenu1.setMnemonic(KeyEvent.VK_S);
        menuItem1 = new JMenuItem("New");
        submenu1.add(menuItem1);
        menuItem2 = new JMenuItem("Edit");
        submenu1.add(menuItem2);
        menu1.add(submenu1);

        //Partner submenu
        menu1.addSeparator();
        submenu2 = new JMenu("Partner");
        submenu2.setMnemonic(KeyEvent.VK_S);
        menuItem1 = new JMenuItem("New");
        submenu2.add(menuItem1);
        menuItem2 = new JMenuItem("Edit");
        submenu2.add(menuItem2);
        menu1.add(submenu2);

        return menuBar;
    }

}
