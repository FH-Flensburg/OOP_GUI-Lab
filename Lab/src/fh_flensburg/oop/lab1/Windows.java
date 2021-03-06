package fh_flensburg.oop.lab1;

import javax.swing.*;

/**
 * Hodie mihi, Cras tibi - Der Friedhofsmanager
 * Casual Game im Kurs Game Design an der FH Flensburg
 * <p/>
 * Created with IntelliJ IDEA.
 * Author: Stefano Kowalke
 * Date: 19.03.13
 * Time: 14:15
 */
public class Windows
{
	private static final int windowCount = 7;
	
	public static void main (String [] args)
	{	
		JFrame[] windows = new JFrame[windowCount];

		for (int i = windows.length-1; i >= 0; i--)
		{
			windows[i] = new JFrame("Fenster" + (i + 1));
			windows[i].setSize(100 * (i + 2), 100 * (i + 2));
			windows[i].add(new JLabel("Moin"));
			windows[i].setLocationRelativeTo(null);
			windows[i].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			windows[i].setVisible(true);
		}
	}
}
