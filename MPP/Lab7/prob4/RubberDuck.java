package prob4;

public class RubberDuck extends Duck {
	
	@Override
	public void display() {
		System.out.println("  am Rubber Duck");
		fly();
		quack();
		swim();
	}

	@Override
	public void fly() {
		Flyable.canNotFly();
	}

	@Override
	public void quack() {
		Quackable.squeak();
	}
	
}
