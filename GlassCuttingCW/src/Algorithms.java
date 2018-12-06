/**
 * @Purpose: The Algorithms class contains the two algorithms you have to implement  
 * Do NOT modify the names and signatures of the two algorithm methods
 * 
 * @author  RYK
 * @since   30/10/2018
 * extended by @author 
 *
 **/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithms {

	/**
	 * This method is used to implement the next fit algorithm
	 * 
	 * @param shapes:a list of shapes representing customer requests(shapes to be
	 *            cut/placed)
	 * @return a list of the sheets used to fulfil all customer requests (i.e.
	 *         place all the shapes). e.g. if you pass a "shapes" list that has
	 *         two shapes {(w=200,h=200),(w=50,h=100)}, then the returned list
	 *         of sheets should show us all the information needed (e.g. that
	 *         one sheet is used, this sheet has one shelf and this shelf has
	 *         two shapes in it). In the test program, you can use the returned
	 *         list to retrieve the total number of sheets used.
	 **/
	public List<Sheet> nextFit(List<Shape> shapes) {

		/*
		 * Start with an empty list of sheets (remember each sheet has a width
		 * of 300 and a height of 250 as specified in the Sheet class)
		 */
		List<Sheet> usedSheets = new ArrayList<Sheet>();
		List<Shape> emptyList = new ArrayList<Shape>();		
		for(int i =0; i<shapes.size()  ; i++){ 
		//for each shape
		/*sheet*/	for (int i2 =0; i2<usedSheets.size(); i2++){ 
					// check each sheet
		/*shelf*/		for(int i3=0; i3<usedSheets.get(i2).getShelves().size()  ; i3++){ 
						// and each shelf within each sheet
		/*hei*/				if (usedSheets.get(i2).getShelves().get(i3).getShapes().isEmpty() || shapes.get(i).getHeight() >usedSheets.get(i2).getShelves().get(i3).getShapes().get(0).getHeight()){ 
							// if the first one isn't set or if the height of this shape is less than the first shape in shelf's height 
		/*wid*/					if (usedSheets.get(i2).SHEET_WIDTH - usedSheets.get(i2).getShelves().get(i3).sumWidth() >= shapes.get(i).getWidth()){ 
								// make sure not too big to fit
							
								}
							}
		/*hei*/				else if (usedSheets.get(i2).SHEET_HEIGHT - usedSheets.get(i2).sumHeight() >= shapes.get(i).getHeight()){
							// if there's enough space for another shelf
							Shelf newShelf = new Shelf();
							usedSheets.get(i2).addShelf(newShelf);
		/*hei*/				}
						// if there isn't enough space for a shelf, make a new sheet
		/*shelf*/		else {
						Sheet newSheet = new Sheet();
						usedSheets.add(newSheet);
						}
						}
		/*sheet*/	}
			//if in sheet x,
			//in shelf y there is a space, put it there, start again from 1
		}
		/*
		 * Add in your own code so that the method will place all the shapes
		 * according to NextFit under ALL the assumptions mentioned in the
		 * specification
		 */

		return usedSheets;
	}

	/**
	 * This method is used to implement the first fit algorithm
	 * 
	 * @param shapes:a list of shapes representing customer requests (shapes to be
	 *            cut/placed)
	 * @return a list of the sheets used to fulfil all customer requests (i.e. place
	 *         all the shapes). e.g. if you pass a "shapes" list that has two
	 *         shapes {(w=200,h=200),(w=50,h=100)}, then the returned list of
	 *         sheets should show us all the information needed (e.g. that one
	 *         sheet is used, this sheet has one shelf and this shelf has two
	 *         shapes in it). In the test program, you can use the returned list
	 *         to retrieve the total number of sheets used
	 **/
	public List<Sheet> firstFit(List<Shape> shapes) {

		/*
		 * Start with an empty list of sheets (remember each sheet has a width
		 * of 300 and a height of 250 as specified in the Sheet class)
		 */
		List<Sheet> usedSheets = new ArrayList<Sheet>();

		/*
		 * Add in your own code so that the method will place all the shapes
		 * according to FirstFit under the assumptions mentioned in the spec
		 */
		
		return usedSheets;
	}

}
