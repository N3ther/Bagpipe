package net.oijon.Bagpipe;

public class Main {

	public static void main(String[] args) {
		Tube tube = new Tube(9, 0.5F, 2);
		System.out.println("Frequencies: " + tube.getFrequencies(36000).toString());
	}
}
