package net.oijon.Bagpipe;

public class Main {

	public static void main(String[] args) {
		Tube tube = new Tube(9, 0.5F, 2);
		
		System.out.print("Frequencies: ");
		
		float[] frequencies = tube.getFrequencies(32000);
		
		for (int i = 0; i < frequencies.length - 1; i++) {
			System.out.print(frequencies[i] + ", ");
		}
		System.out.print(frequencies[frequencies.length - 1]);
		System.out.print("\n");
	}
}
