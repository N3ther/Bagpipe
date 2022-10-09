package net.oijon.Bagpipe;

public class Tube {

	private float length; // cm
	private float radius; // cm
	private float area; // cm^2
	private int amountOfOpenings; // 0 to 2
	
	private int velocity = 34300; // speed of sound, cm/s
	
	//Creates the tube
	public Tube(float length, float radius, int amountOfOpenings) {
		this.length = length;
		this.radius = radius;
		this.amountOfOpenings = amountOfOpenings;
		area = (float) (2 * Math.PI * radius * length) 
				+ (float) (2 * Math.PI * (radius * radius));
	}
	
	//Generates frequencies produced based off tube properties
	public float[] getFrequencies() {
		float[] frequencies = new float[5]; //max of 5 frequencies modeled at once
		
		
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
		
		// f = c/2L
		if (amountOfOpenings % 2 == 0) {
			
			for (int i = 0; i < 5; i++) {
				frequencies[i] = (i * 2) * (velocity / (2 * length));
			}
			
		// f = c/4L
		} else {
			
			for (int i = 0; i < 5; i++) {
				frequencies[i] = (i * 2 + 1) * (velocity / (4 * length));
			}
		}
		return frequencies;
	}
	
	public float getLength() {
		return length;
	}
	
	public float getRadius() {
		return radius;
	}
	
	public float getArea() {
		return area;
	}
	
	public int getOpenings() {
		return amountOfOpenings;
	}
	
	public float getHelmholtz(Tube resonator, Tube opening) {
		float frequency = (float) ((velocity / (2 * Math.PI)) * Math.sqrt((opening.getRadius() * 2) / resonator.getArea() * opening.getLength()));
		return frequency;
	}
}
