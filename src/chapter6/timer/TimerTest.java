package chapter6.timer;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

/**
 * @version 1.00 2016-12-14
 * @author Zhang Yufei
 */
public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimerPrinter();
        
        // construct a timer that calls the listener.
        // once every 10 seconds.
        Timer t = new Timer(1000, listener);
        t.start();
        
        JOptionPane.showMessageDialog(null, "Quit program ?");
        System.exit(0);
    }
}

class TimerPrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("At the tone, the time is " + now);
        Toolkit.getDefaultToolkit().beep();
    }
    
}
