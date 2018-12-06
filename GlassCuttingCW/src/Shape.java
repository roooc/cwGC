/**
 * @Purpose: The shape class represents a single shape. DO NOT MODIFY THE
 *           SIGNITURE OF EXISTING METHODS, You may add additional methods if
 *           you wish
 * 
 * @author RYK
 * @since 30/10/2018 
 * extended by @author
 * 
 **/

public class Shape implements Comparable<Shape> {

	private int sWidth;   // width of the shape
	private int sHeight;  // height of the shape

	/**
	 * A Shape constructor to set the width and height of a shape. 
	 * @param width of a shape
	 * @param height of a shape
	 **/
	public Shape(int width, int height) {

		// Shape width and height should not be greater than the sheet width and height
		if (width > Sheet.SHEET_WIDTH || height > Sheet.SHEET_HEIGHT) {
			throw new IllegalArgumentException("Shape width or height is not valid");
		}

		this.sWidth = width;
		this.sHeight = height;
	}

	/**
	 * @return height of a shape
	 **/
	public int getHeight() {
		return sHeight;
	}

	/**
	 * @return width of a shape
	 */
	public int getWidth() {
		return sWidth;
	}
	public void printHeight(){
		System.out.println(sHeight);
	}
	public void printWidth(){
		System.out.println(sWidth);
	}
	@Override
	public int compareTo(Shape o) {
		// You may want to implement this method
		return 0;
	}
}
