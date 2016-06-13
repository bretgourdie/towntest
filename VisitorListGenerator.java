public class VisitorListGenerator extends Generator {
	
	private int iStudent = 0;
	private int iProfessor = 1;
	private int iBusinessPerson = 2;
	private int iBlogger = 3;
	private int numberOfVisitorTypes = 4;
	
	public VisitorListGenerator(int seed){ 
		super(seed);
	}
	
	public LinkedList<Visitor> getVisitorList(){
		int numberOfVisitors = 5;
		LinkedList<Visitor> visitorList = new LinkedList<Visitor>();
		
		for(int ii = 0; ii < numberOfVisitors; ii++){
			int nextVisitor = this.nextInt(numberOfVisitorTypes);
			
			switch (nextVisitor){
				case iStudent: visitorList.add(new Student());
				break;
				
				case iProfessor: visitorList.add(new Professor());
				break;
				
				case iBusinessPerson: visitorList.add(new BusinessPerson());
				break;
				
				case iBlogger: visitorList.add(new Blogger());
				break;
			}
			
			return visitorList;
		}
	}
}