package chapter8.button;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * A frame with a button panel.
 */
public class ButtonFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1174317175933784068L;
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;

	public ButtonFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// create buttons.
		JButton yellowButton = new JButton(
				"Yellow");
		JButton blueButton = new JButton("Blue");
		JButton redButton = new JButton("Red");

		buttonPanel = new JPanel();

		// add buttons to panel.
		buttonPanel.add(yellowButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(redButton);

		// add panel to frame
		add(buttonPanel);

		// create button actions
		ColorAction yellowAction = new ColorAction(
				Color.YELLOW);
		ColorAction blueAction = new ColorAction(
				Color.BLUE);
		ColorAction redAction = new ColorAction(
				Color.RED);

		// associate actions with buttons.
		yellowButton
				.addActionListener(yellowAction);
		blueButton.addActionListener(blueAction);
		redButton.addActionListener(redAction);

		buttonPanel.setFocusable(true);
		buttonPanel
				.addKeyListener(new KeyListener() {
					@Override
					public void keyTyped(
							KeyEvent e) {
						// TODO Auto-generated method stub
					}

					@Override
					public void keyPressed(
							KeyEvent e) {
						// TODO Auto-generated method stub
						System.out.print("*");
						buttonPanel
								.setBackground(Color.GREEN);
					}

					@Override
					public void keyReleased(
							KeyEvent e) {
						// TODO Auto-generated method stub
						System.out.println();
						buttonPanel
								.setBackground(null);
					}
				});
	}

	private class ColorAction implements
			ActionListener {
		private Color backgroundColor;

		public ColorAction(Color c) {
			backgroundColor = c;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			buttonPanel
					.setBackground(backgroundColor);
		}

	}

	public static void main(String[] args) {
		new ButtonFrame().setVisible(true);
	}
}
