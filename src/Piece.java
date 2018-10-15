
public class Piece {
	Echiquier e;
	Case c;
	private boolean isBlue;
	
	public Piece(Echiquier e, Case c, boolean isBlue) {
		this.e = e;
		this.c = c;
		this.isBlue = isBlue;
	}
	
	public void move(Case c){
		e.cases[this.c.x][this.c.y].P = null;
		e.cases[c.x][c.y].P = this;
		this.c = c;
		e.changeTour();
	}
	
	
	public boolean moveTo(Case c){
		return false;
	}
	
	public boolean isBlue(){
		return isBlue;
	}
	
	public String ToString(){
		return "Err";
	}
}
