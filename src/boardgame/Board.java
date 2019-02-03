package boardgame;

public class Board {
	
	private Integer rows;
	private Integer columns;
	private Piece [][] pieces;
	public Board(Integer rows, Integer columns) {
		if(rows < 1 || columns < 1 ) {
			throw new BoardException("Errorcreating the board: There must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece [rows][columns];
	}
	public Integer getRows() {
		return rows;

	}
	public Integer getColumns() {
		return columns;
	}
	
	public Piece peice(Integer row, Integer column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces [row][column];
	}
	
	public Piece peice(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
		
	}
	
	public void placePiece(Piece piece,Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position"+ position);
		}
		
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	 private Boolean positionExists(Integer row,Integer column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
		
	}
	
	 public Boolean positionExists(Position position) {
		 
		return positionExists(position.getRow(), position.getColumn());
	}
	 public Boolean thereIsAPiece(Position position) {
		 if(!positionExists(position)) {
				throw new BoardException("Position not on the board");
			}
		 return peice(position)!=null;
	
	 }
	 
}
