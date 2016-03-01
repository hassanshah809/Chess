package pieces;

import java.awt.Point;

import model.AbstractPiece;
import view.Board;

public class King extends AbstractPiece {
	
	/**
	 * @param piecename
	 * @param color
	 */
	public King(String piecename, String color){
		super(piecename, color);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isMoveAllowed(Point beg, Point end, Board b) {
		// TODO Auto-generated method stub
		return false;
	}

}