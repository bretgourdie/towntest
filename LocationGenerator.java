public class LocationGenerator extends Generator {
	
	private Location locationList[];
	
	public LocationGenerator(int seed){
		super(seed);
		
		locationList = new Location[5];
		locationList[0] = Location.CathedralOfLearning;
		locationList[1] = Location.SquirrelHill;
		locationList[2] = Location.ThePoint;
		locationList[3] = Location.Downtown;
		locationList[4] = null; // used to indicate "leave"
	}
	
	public Location getLocation(){
		// Don't return null as one of the possibilities
		return getLocationOrLeave(this.locationList.length - 1);
	}
	
	public Location getLocationOrLeave(){
		return getLocationOrLeave(this.locationList.length);
	}
	
	private Location getLocationOrLeave(int upperBound){
		int nextLocation = this.nextInt(upperBound);
		
		return locationList[nextLocation];
	}
}