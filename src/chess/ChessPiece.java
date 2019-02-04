package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{



	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	private Color color;

	public Color getColor() {
		return color;
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		
		return p.getColor() != null && p.getColor() != this.color;
	}
	

}
