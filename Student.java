
public class Student extends Visitor {
	public Student() { super(); }
	
	public boolean prefersLocation(Location location){
		return location != Location.CathedralOfLearning;
	}
	
	public String toString(){
		return new String("Student");
	}
}