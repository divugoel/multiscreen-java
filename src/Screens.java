import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 02/07/15.
 */

public class Screens extends JFrame implements ActionListener {

    public JPanel mainPanel = new JPanel(new CardLayout());
    public JPanel signUpScreen;
    public JPanel signInScreen;

    JButton signUpButton;
    JButton signInButton;

    public Screens() {
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setupSignInScreen();
        mainPanel.add(signInScreen, "sign_in_screen");

        setupSignUpScreen();
        mainPanel.add(signUpScreen, "sign_up_screen");



        pack();
        setVisible(true);
    }


    public static void main(String[] args) {

        new Screens();

    }

    public void setupSignUpScreen() {
        signUpScreen = new JPanel();


        signUpButton = new JButton("Already have an Account!");
        signUpButton.addActionListener(this);
        signUpScreen.add(signUpButton);

        JLabel label = new JLabel("This is singup Screen");
        signUpScreen.add(label);
    }

    public void setupSignInScreen() {

        signInScreen = new JPanel();

        signInButton = new JButton("Don't have an account");
        signInButton.addActionListener(this);
        signInScreen.add(signInButton);

        JLabel label = new JLabel("This is signin Screen");
        signInScreen.add(label);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == signInButton) {
            CardLayout layout = (CardLayout)mainPanel.getLayout();
            layout.show(mainPanel, "sign_up_screen");
        } else if (e.getSource() == signUpButton) {
            CardLayout layout = (CardLayout)mainPanel.getLayout();
            layout.show(mainPanel, "sign_in_screen");
        }
    }
}
