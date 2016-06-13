public class Blogger extends Visitor {
	public Blogger() {super(); }
	
	public boolean prefersLocation(Location location){
		return false;
	}
	
	public String toString(){
		return new String("Blogger");
	}
}