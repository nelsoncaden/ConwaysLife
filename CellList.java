/**
 * Forms a data structure for the cells.
 * @author Caden Nelson
 *
 */
public class CellList {
	private int[][] cellList = null;
	private int rectSize = 0;
	
	public CellList(int rectSize) {
		this.rectSize = rectSize;
		cellList = new int[rectSize][rectSize];
		for (int i = 0; i < rectSize; i++) {
			for (int j = 0; j < rectSize; j++) {
				cellList[i][j] = 0;
			}
		}
	}
	
	public void iterate() {
		//Create new 2D array of same size for representing neighbor states
		int[][] neighborList = new int[rectSize][rectSize];
		//Add in values below each cell
		for (int i = 0; i < rectSize; i++) {
			for (int j = 0; j < rectSize; j++) {
				if (i == 0) {
					neighborList[i][j] += neighborList[rectSize][j];
				} else {
					neighborList[i][j] += neighborList[i - 1][j];
				}
			}
		}
		//Add in values from the left of each cell
		for (int i = 0; i < rectSize; i++) {
			for (int j = 0; j < rectSize; j++) {
				if (j == 0) {
					neighborList[i][j] += neighborList[rectSize][j];
				} else {
					neighborList[i][j] += neighborList[i][j - 1];
				}
			}
		}
		//Add in values from above each cell
		for (int i = 0; i < rectSize; i++) {
			for (int j = 0; j < rectSize; j++) {
				if (i == rectSize) {
					neighborList[i][j] += neighborList[0][j];
				} else {
					neighborList[i][j] += neighborList[i + 1][j];
				}
			}
		}
		//Add in values from the right of each cell
		for (int i = 0; i < rectSize; i++) {
			for (int j = 0; j < rectSize; j++) {
				if (j == rectSize) {
					neighborList[i][j] += neighborList[i][0];
				} else {
					neighborList[i][j] += neighborList[i][j + 1];
				}
			}
		}
		//Update states based on neighbor states
		for (int i = 0; i < rectSize; i++) {
			for (int j = 0; j < rectSize; j++) {
				if (cellList[i][j] == 1 && (neighborList[i][j] == 2 || neighborList[i][j] == 3)) {
					cellList[i][j] = 1;
				} else if (cellList[i][j] == 0 && neighborList[i][j] == 3) {
					cellList[i][j] = 1;
				} else {
					cellList[i][j] = 0;
				}
			}
		}
	}
	
	public int[][] getCellList() {
		return cellList;
	}
}
