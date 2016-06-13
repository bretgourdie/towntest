public class Professor extends Visitor {
	public Professor() { super(); }
	
	public boolean prefersLocation(Location location){
		return true;
	}
	
	public String toString(){
		return new String("Professor");
	}
}