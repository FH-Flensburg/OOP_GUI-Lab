package fh_flensburg.oop.lab3;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Author: Stefano Kowalke
 * Date: 09.04.13
 * Time: 14:47
 */
public class Start
{
	static private int rows = 8;
	static private int columns = 8;
	static private Random randomGen = new Random();

	public static void main(String[] argv)
	{


		JFrame mainWindow = new JFrame("Übung3");
		mainWindow.setLayout(new GridLayout(rows, columns));
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setBackground(Color.white);
		mainWindow.setSize(800, 800);
		mainWindow.setLocationRelativeTo(null);

		GeometricObject [] myObjects = new GeometricObject[rows * columns];

		for (int i = 0; i < rows * columns; i++)
		{
			Color color = new Color(randomGen.nextInt(255), randomGen.nextInt(255), randomGen.nextInt(255));

			switch (randomGen.nextInt(5))
			{
				case 0:
					myObjects[i] = new Square(color, Math.random());
					break;

				case 1:
					myObjects[i] = new Circle(color, Math.random());
					break;

				case 2:
					myObjects[i] = new Triangle(color, Math.random());
					break;

				case 3:
					myObjects[i] = new PacMan(color, Math.random());
					break;

				case 4:
					myObjects[i] = new MySpecialShape(color, Math.random());
					break;

				default:

			}
		}

		for (int i = 0; i < rows * columns; i++)
		{
			mainWindow.add(myObjects[i]);
		}
		mainWindow.setVisible(true);
	}
}
