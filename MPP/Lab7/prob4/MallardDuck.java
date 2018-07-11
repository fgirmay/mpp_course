package prob4;

public class MallardDuck extends Duck {
	
	@Override
	public void display() {
		System.out.println("  am Mallard Duck");
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
