import simpleGUI.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 * Test main
 */
public class Main {
    /**
     * @param args test
     */
    public static void main(String[] args) {
        Window window = new Window();
        window.addFrame();
        window.getFrame().addActionButton("hello");

        window.getFrame().addLabel().setSize(2,2,20,20);
        window.getFrame().addTextBox();

        //window.addScrollbar1();
        //window.addScrollbar(true, true);
        window.build();
       /* Window window = new Window();
        window.setSize(300, 600);
        //window.addScrollbar(true, true);
        //window.addFrame();
        window.addScrollbar1();
        window.build();*/

        /*
        final JFrame frame = new JFrame("JScrollbar Demo");
        //final JLabel label = new JLabel( );
        JPanel panel = new JPanel();
        JButton button = new JButton("knapp");
        button.setBounds(10,10,80,80);
        panel.add(button);

        JScrollBar hbar=new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 500);
        JScrollBar vbar=new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 500);

        class MyAdjustmentListener implements AdjustmentListener {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setBackground(Color.BLACK);
                label.setText("Slider's position is " + e.getValue());
                frame.repaint();
            }
        }

      //  hbar.addAdjustmentListener(new MyAdjustmentListener( ));
      //  vbar.addAdjustmentListener(new MyAdjustmentListener( ));

        frame.setLayout(new BorderLayout( ));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
       // frame.getContentPane().add(label);

        frame.add(panel);

        frame.setBackground(Color.BLUE);
        frame.getContentPane().add(hbar, BorderLayout.SOUTH);
        frame.getContentPane().setBackground(Color.PINK);
        frame.getContentPane().add(vbar, BorderLayout.EAST);
        //frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setVisible(true);*/
    }
}
