package fh_flensburg.oop.lab3;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Author: Stefano Kowalke
 * Date: 09.04.13
 * Time: 14:46
 */
public class MySpecialShape extends GeometricObject
{
	/**
	 * Constructor who sets the color and the relative size
	 *
	 * @param color The color of the object
	 * @param relativeSize The size of the object relative to the surrounding frame
	 */
	MySpecialShape(Color color, double relativeSize)
	{
		super(color, relativeSize);
	}

	/**
	 * Drawing the special shape here. It will be called by the parent object
	 *
	 * @param g The graphics object
	 * @param startPoint The start point.
	 *                   This is the top left point from where java start to draw the object
	 */
	@Override
	protected void specialPaint(Graphics g, Point startPoint)
	{
		int [] xs = {getObjectWidth() / 4, getFrameWidth() - getObjectWidth() / 4, getFrameWidth()/2, getObjectWidth() / 4, getFrameWidth() - getObjectWidth() / 4};
		int [] ys = {getObjectHeight(), getObjectHeight(), getFrameHeight() / 2, getFrameHeight() - getObjectHeight(), getFrameHeight() - getObjectHeight()};
		g.fillPolygon(xs, ys, 5);
	}
}
