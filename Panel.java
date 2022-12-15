import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * See https://gist.github.com/cemremengu/1555805
 * @author Caden Nelson
 *
 */
public class Panel extends JPanel {
	private int rectSize;
	private int[][] cellList;
	
	public Panel() {
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(0, 0, 0));
		for (int i = 0; i < rectSize; i++) {
			for (int j = 0; j < rectSize; j++) {
				if (cellList[i][j] == 1) {
					g.fillRect(i * (600/rectSize), j * (400/rectSize), 600/rectSize, 400/rectSize);
				}
			}
		}
	} 
	
	public void setCellList(int[][] cellList) {
		this.cellList = cellList;
	}
}
