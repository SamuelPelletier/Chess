
public class Pion extends Piece {

	public Pion(Echiquier e, Case c, boolean isBlue) {
		super(e, c, isBlue);
		// TODO Auto-generated constructor stub
	}
	
	public boolean moveTo(Case c){
		//Guardian
		if(c.P.isBlue() == this.isBlue()){
			return false;
		}
		
		boolean canMove = false;
		
		if(this.isBlue()){
			if(this.c.x + 1 == c.x){
				if(((this.c.y - 1 == c.y || this.c.y + 1 == c.y) && c.P != null && c.P.isBlue() != this.isBlue() ) || this.c.y == c.y){
					canMove = true;
				}
			}
		}else{
			if(this.c.x - 1 == c.x){
				if(((this.c.y - 1 == c.y || this.c.y + 1 == c.y) && c.P != null && c.P.isBlue() != this.isBlue()) || this.c.y == c.y){
					canMove = true;
				}
			}
		}
		
		if(canMove){
			super.move(c);
		}
		return canMove;
	}
	
	public String ToString(){
		return "P";
	}

}
