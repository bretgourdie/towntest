public abstract class Visitor {
	public Visitor() {}
	
	public abstract boolean prefersLocation(Location location);
	
	public abstract String toString();
}