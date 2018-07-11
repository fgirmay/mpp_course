package prob4;

public class RedHeadDuck extends Duck {
	
	@Override
	public void display() {
		System.out.println("  am Red Head Duck");
		fly();
		quack();
		swim();
	}

	@Override
	public void fly() {
		Flyable.flyWithWings();
	}

	@Override
	public void quack() {
		Quackable.quack();
	}
	
}
