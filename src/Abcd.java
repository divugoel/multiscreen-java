import javax.swing.*;

/**
 * Created by cerebro on 02/07/15.
 */
public class Abcd {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            showWindow(i);
        }
    }

    public static void showWindow(int i) {
        JFrame window = new JFrame("this is a window " + i);

        JLabel label = new JLabel("this is a label " + i);

        window.add(label);


//        window.setSize(300, 300);

        window.pack();
        window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        window.setVisible(true);
    }
}
