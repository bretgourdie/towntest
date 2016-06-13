import java.util.LinkedList;

public class CitySim9002 {
	public static void Main(string[] args){
		if(args.length != 1){
			System.out.println("Expecting 1 integer argument; \""
			+ Integer.toString(args.length) + "\" arguments specified");
			
			return;
		}
		
		int seed = 0;
		
		try {
			seed = Integer.parseInt(args[0]);
		} catch (NumberFormatException ex) {
			System.out.println("Expecting 1 integer argument; argument \""
			+ args[0] + "\" specified.");
		}
		
		System.out.println("Welcome to CitySim!  Your seed is " + Integer.toString(seed));
		
		VisitorListGenerator visgen = new VisitorListGenerator(seed);
		
		LocationGenerator locgen = new LocationGenerator(seed);
		
		LinkedList<Visitor> vislist = visgen.getVisitorList();
		
		ListIterator<Visitor> it = vislist.listIterator();
		
		int visitorNumber = 0;
		
		while(it.hasNext()){
			visitorNumber++;
			Visitor visitor = it.next();
			
			String visitorWNum = new String("Visitor " + Integer.toString(visitorNumber));
			
			System.out.println(
				visitorWNum
				+ " is a "
				+ visitor.toString()
				+ ".");
			
			boolean hadFirstVisit = false;
			Location curLocation = null;
			
			do {
				
				if(!hadFirstVisit){
					curLocation = locgen.getLocation();
				}
				else{
					curLocation = locgen.getLocationOrLeave();
				}
				hadFirstVisit = true;
				
				if(curLocation == null){
					System.out.println(
					visitorWNum
					+ " has left the city.\n***");
				}
				
				else{
					String stLocation = getLocationString(curLocation);
					
					System.out.println(
					visitorWNum
					+ " is going to "
					+ stLocation
					+ "!");
					
					boolean liked = visitor.prefersLocation(location);
					
					String notLiked = "";
					if(!liked){
						notLiked = " not";
					}
					
					System.out.println(
					visitorWNum
					+ " did"
					+ notLiked
					+ " like "
					+ stLocation
					+ ".");
				}
			} (while curLocation != null);
		}
	}
}