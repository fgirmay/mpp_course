package prob4;

public interface Quackable {
	
	static void quack() {
		System.out.println("  quack");
	}
	
	static void muteQuack() {
		System.out.println("  cannot quack");
	}
	
	static void squeak() {
		System.out.println("  squeaking");
	}
	
}
