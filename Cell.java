/**
 * The cell contains links to all neighboring cells and has the boolean
 * variable state. If state is true it is living else it is dead. 
 * Coordinates for the cell are also provided.
 * @author Caden Nelson
 *
 */
public class Cell {
	int xValue;
	int yValue;
	Cell above;
	Cell left;
	Cell right;
	Cell below;
	Cell topLeft;
	Cell topRight;
	Cell bottomLeft;
	Cell bottomRight;
	boolean state;
	
	public Cell(int xValue, int yValue, Cell above, Cell left, Cell right, Cell below, Cell topLeft, Cell topRight,
			Cell bottomLeft, Cell bottomRight, boolean state) {
		super();
		this.xValue = xValue;
		this.yValue = yValue;
		this.above = above;
		this.left = left;
		this.right = right;
		this.below = below;
		this.topLeft = topLeft;
		this.topRight = topRight;
		this.bottomLeft = bottomLeft;
		this.bottomRight = bottomRight;
		this.state = state;
	}

	public void changeState() {
		if (state) {
			if (neighborStates() == 2 || neighborStates() == 3) {
				state = true;
			}
		} else {
			if (neighborStates() == 2) {
				state = true;
			}
		}
		state = false;
	}
	
	public int neighborStates() {
		int numStates = 0;
		if (above.state) {
			numStates++;
		}
		if (left.state) {
			numStates++;
		}
		if (right.state) {
			numStates++;
		}
		if (below.state) {
			numStates++;
		}
		if (topLeft.state) {
			numStates++;
		}
		if (topRight.state) {
			numStates++;
		}
		if (bottomLeft.state) {
			numStates++;
		}
		if (bottomRight.state) {
			numStates++;
		}
		return numStates;
	}
}
