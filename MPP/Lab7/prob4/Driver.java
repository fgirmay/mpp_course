package prob4;

public class Driver {

	public static void main(String[] args) {
		
		Duck[] ducks = {new MallardDuck(),
						new RedHeadDuck(),
						new RubberDuck(),
						new DecoyDuck()};
		for(Duck d: ducks){
			System.out.println(d.getClass().getSimpleName() + ": ");
			d.display();
			/*d.fly();
			d.quack();
			d.swim();*/
		}

	}

}
