package prob4;

public class DecoyDuck extends Duck {
	
	@Override
	public void display() {
		System.out.println("  am Decoy Duck");
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
		Quackable.muteQuack();
	}
}
