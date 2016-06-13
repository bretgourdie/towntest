public class BusinessPerson extends Visitor {
	public BusinessPerson() {super(); }
	
	public boolean prefersLocation(Location location){
		return location == Location.SquirrelHill || location == Location.Downtown;
	}
	
	public String toString(){
		return new String("Business Person");
	}
}