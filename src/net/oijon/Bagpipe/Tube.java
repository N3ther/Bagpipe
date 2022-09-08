package net.oijon.Bagpipe;

public class Tube {

	private float length; // cm
	private float radius; // cm
	private float area; // cm^2
	private int amountOfOpenings; // 0 to 2
	
	
	public Tube(float length, float radius, int amountOfOpenings) {
		this.length = length;
		this.radius = radius;
		this.amountOfOpenings = amountOfOpenings;
		area = (float) (2 * Math.PI * radius * length) 
				+ (float) (2 * Math.PI * (radius * radius));
	}
	
	public float[] getFrequencies(float velocity) {
		float[] frequencies = new float[3];
		
		if (amountOfOpenings < 0) {
			System.err.println("Tube attempted to be created with " +
		amountOfOpenings + " openings! Setting to 0...");
			amountOfOpenings = 0;
		}
		if (amountOfOpenings > 2) {
			System.err.println("Tube attempted to be created with " +
					amountOfOpenings + " openings! Setting to 2...");
			amountOfOpenings = 2;
		}
		
		switch (amountOfOpenings) {
		case 0:
			frequencies[0] = velocity / (2 * length);
			frequencies[1] = velocity / length;
			frequencies[2] = (3 * velocity) / (2 * length);
			break;
		case 1:
			frequencies[0] = velocity / (4 * length);
			frequencies[1] = (3 * velocity) / (4 * length);
			frequencies[2] = (5 * velocity) / (4 * length);
			break;
		case 2:
			frequencies[0] = velocity / (2 * length);
			frequencies[1] = velocity / length;
			frequencies[2] = (3 * velocity) / (2 * length);
			break;
		}
		return frequencies;
	}
	
}
