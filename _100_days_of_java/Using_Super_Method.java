package _100_days_of_java;

public class Using_Super_Method extends Super_Method {
	public Using_Super_Method(String line) {
		super(line);
	}
	
	public static void main(String[] args) {
		Using_Super_Method obj = new Using_Super_Method("Nalla manaiyaalin nesam oru kodi\r\n"
				+ "Nenjamenum veenai paadumae thodi\r\n"
				+ "Sandhoosha saamraajyamae…");
	}
}