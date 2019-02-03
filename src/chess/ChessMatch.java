package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	} 
	
	public ChessPiece[][] getPieces(){
		ChessPiece [][] mat = new ChessPiece [board.getRows()][board.getColumns()];
		for(int i = 0; i < board.getRows(); i++) {
			
			for(int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.peice(i, j);
			}
			
		}
		return mat; 
	} 
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board,Color.Whit));
		placeNewPiece('e', 8,new King(board, Color.Black));
		placeNewPiece('e', 1,new King(board, Color.Whit));
	}
	
	private void placeNewPiece(Character column,Integer row,ChessPiece piece) 
	{
		board.placePiece(piece,new ChessPosition(column, row).toPosition());
	}
}
