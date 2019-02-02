package boardgame;

public class Position {

	private Integer rowl;
	private Integer column;
	public Position(Integer rowl, Integer column) {
		this.rowl = rowl;
		this.column = column;
	}
	public Integer getRowl() {
		return rowl;
	}
	public void setRowl(Integer rowl) {
		this.rowl = rowl;
	}
	public Integer getColumn() {
		return column;
	}
	public void setColumn(Integer column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		
		return rowl + ", "+ column; 
	}
	
}
