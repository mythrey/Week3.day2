package week3.day2.assignments;

public class Desktop implements HardWare, Software {

	public void desktopModel() {
		System.out.println("Desktop model under abstract class Desktop");
	}

	public void hardwareResources() {
		System.out.println("hardware from interface Hardware");
	}

	public void softwareResources() {
		System.out.println("software from interface Sardware");
	}

	public static void main(String[] args) {
		Desktop dk = new Desktop();
		dk.desktopModel();
		dk.hardwareResources();
		dk.softwareResources();

	}
}
