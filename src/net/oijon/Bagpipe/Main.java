package net.oijon.Bagpipe;

public class Main {

	public static void main(String[] args) {
		Tube tube = new Tube(12, 3, 1);
		
		Tube helmholtzTube = new Tube(8, 4, 1);
		
		System.out.print("Frequencies: ");
		
		float[] frequencies = tube.getFrequencies();
		
		/** Sorts frequencies
		for (int i = 0; i < frequencies.length; i++) {
			if (i != frequencies.length - 1) {
				if (frequencies[i] > frequencies[i + 1]) {
					float tempFloat = frequencies[i + 1];
					frequencies[i + 1] = frequencies[i];
					frequencies[i] = tempFloat;
					i = 0;
				}
			}
			
			if (i != 0) {
				if (frequencies[i] < frequencies[i - 1]) {
					float tempFloat = frequencies[i - 1];
					frequencies[i - 1] = frequencies[i];
					frequencies[i] = tempFloat;
					i = 0;
				}
			}
		}
		**/
		for (int i = 0; i < frequencies.length; i++) {
			System.out.print(frequencies[i] + ",\n");
		}
		
		System.out.print("\n");
	}
}
