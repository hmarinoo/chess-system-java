package boardgame;

public class Board {
	
	private Integer rowls;
	private Integer columns;
	private Piece [][] pieces;
	public Board(Integer rowls, Integer columns) {
		this.rowls = rowls;
		this.columns = columns;
		pieces = new Piece [rowls][columns];
	}
	public Integer getRowls() {
		return rowls;
	}
	public void setRowls(Integer rowls) {
		this.rowls = rowls;
	}
	public Integer getColumns() {
		return columns;
	}
	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
	public Piece peice(Integer rowl, Integer column) {
		
		
		return pieces [rowl][column];
	}
	public Piece peice(Position position) {
		return pieces[position.getRowl()][position.getColumn()];
		
	}
	public void placePiece(Piece piece,Position position) {
		pieces[position.getRowl()][position.getColumn()] = piece;
		piece.position = position;
	}
}
