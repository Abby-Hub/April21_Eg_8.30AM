package pack1;

public class Ball extends Toy {
	
	@Override
	public void move() {
		System.out.println("Bouncing Logic goes Here....");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Ball making sound logic goes Here");
	}

}
