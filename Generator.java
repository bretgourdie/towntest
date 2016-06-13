import java.util.Random;

public abstract class Generator {
	private Random random;
	
	public Generator(long seed){
		random = new Random(seed);
	}
	
	protected nextInt(int upperBound){
		return random.nextInt(upperBound);
	}
}