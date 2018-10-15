
public class Tour extends Piece {

	public Tour(Echiquier e, Case c, boolean isBlue) {
		super(e, c, isBlue);
		// TODO Auto-generated constructor stub
	}

	public boolean moveTo(Case c){
		//Guardian
		if(c.P.isBlue() == this.isBlue()){
			return false;
		}
		return true;
	}
	
	public String ToString(){
		return "T";
	}
}
