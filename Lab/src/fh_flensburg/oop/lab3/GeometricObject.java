package fh_flensburg.oop.lab3;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Author: Stefano Kowalke
 * Date: 09.04.13
 * Time: 14:44
 */
abstract public class GeometricObject extends JPanel
{
	/**
	 * Generator for random numbers
	 */
	protected Random randomGen = new Random();

	/**
	 * The color of the object
	 */
	protected Color color;

	/**
	 * The relative size of the object
	 */
	protected double relativeSize;

	/**
	 * The width of the object
	 * Will be calculated relative to the frame size
	 * by the factor who is stored inside relativeSize
	 */
	protected int objectWidth;

	/**
	 * The height of the object
	 * Will be calculated relative to the frame size
	 * by the factor who is stored inside relativeSize
	 */
	protected int objectHeight;

	/**
	 * The width of the frame
	 */
	protected int frameWidth;

	/**
	 * The height of the frame
	 */
	protected int frameHeight;

	/**
	 * Standard constructor
	 *
	 * Sets the color to black and the size to 100%
	 */
	public GeometricObject()
	{
		setColor(new Color(0, 0, 0));
		setRelativeSize(1);
	}

	/**
	 * Constructor who sets the color
	 *
	 * @param color The color of the object
	 */
	public GeometricObject(Color color)
	{
		setColor(color);
	}

	/**
	 * Constructor who sets the color and the relative size
	 *
	 * @param color The color of the object
	 * @param relativeSize The size of the object relative to the surrounding frame
	 */
	public GeometricObject(Color color, double relativeSize)
	{
		this(color);
		setRelativeSize(relativeSize);
	}

	/**
	 * Getter for the objects width
	 *
	 * @return The width of the object
	 */
	public int getObjectWidth()
	{
		return objectWidth;
	}

	/**
	 * Getter of the objects height
	 *
	 * @return The height of the object
	 */
	public int getObjectHeight()
	{
		return objectHeight;
	}

	/**
	 * Getter of the frame width
	 *
	 * @return The width of the frame
	 */
	public int getFrameWidth()
	{
		return frameWidth;
	}

	/**
	 * Setter for the frame width
	 *
	 * @param frameWidth The width of the frame
	 */
	public void setFrameWidth(int frameWidth)
	{
		this.frameWidth = frameWidth;
	}

	/**
	 * Getter for the frame height
	 *
	 * @return The height of the frame
	 */
	public int getFrameHeight()
	{
		return frameHeight;
	}

	/**
	 * Setter for the frame height
	 *
	 * @param frameHeight The height of the frame
	 */
	public void setFrameHeight(int frameHeight)
	{
		this.frameHeight = frameHeight;
	}

	/**
	 * Setter for the objects width
	 *
	 * @param objectWidth The width of the object
	 */
	public void setObjectWidth(int objectWidth)
	{
		this.objectWidth = objectWidth;
	}

	/**
	 * Setter for the objects height
	 *
	 * @param objectHeight The height of the object
	 */
	public void setObjectHeight(int objectHeight)
	{
		this.objectHeight = objectHeight;
	}

	/**
	 * Setter for the objects color
	 *
	 * @param color The color of the object
	 */
	public void setColor(Color color)
	{
		this.color = color;
	}

	/**
	 * Getter of the objects color
	 *
	 * @return The color of the object
	 */
	public Color getColor()
	{
		return color;
	}

	/**
	 * Setter of the objects relative size
	 *
	 * @param relativeSize The relative size in values from 0.0 to 1.0
	 */
	public void setRelativeSize(double relativeSize)
	{
		this.relativeSize = relativeSize;
	}

	/**
	 * Getter of the objects relative size
	 *
	 * @return The relative size of the objects in values from 0.0 to 1.0
	 */
	public double getRelativeSize()
	{
		return Math.round(relativeSize * 10.) / 10.;
	}

	/**
	 * The paint method from the component
	 * We need to override this method here to drawn our own stuff.
	 *
	 * It draw the red border and calculates all needed values
	 * like the real size of the object and the left top starting point.
	 *
	 * Then it pass the graphics object and the starting point to the
	 * special paint method.
	 *
	 * @param g The graphics context handed in by the origin method
	 */
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);

		// Drawing the red border
		g.setColor(Color.RED);
		g.drawRect(0, 0, (int) getSize().getWidth(), (int) getSize().getHeight());

		// calculate all the needed stuff and draw the shape
		setObjectWidth((int) (getSize().getWidth() * getRelativeSize()));
		setObjectHeight((int) (getSize().getHeight() * getRelativeSize()));

		setFrameWidth((int) getSize().getWidth());
		setFrameHeight((int) getSize().getHeight());

		int startPointX = 1 + (getFrameWidth() / 2) - (getObjectWidth() / 2);
		int startPointY = 1 + (getFrameHeight() / 2) - (getObjectHeight() / 2);

		setRelativeSize(Math.random());
		setColor(new Color(randomGen.nextInt(255), randomGen.nextInt(255), randomGen.nextInt(255)));
		g.setColor(getColor());
		specialPaint(g, new Point(startPointX, startPointY));
	}

	/**
	 * This method need to implement by any derived class to implement the special needs
	 *
	 * @param g The graphics object
	 * @param startPoint The start point.
	 *                   This is the top left point from where java start to draw the object
	 */
	protected abstract void specialPaint(Graphics g, Point startPoint);
}
